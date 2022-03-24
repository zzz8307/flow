package cn.rc.flow.web.service.impl;

import cn.rc.flow.common.exception.AuthorizationFailedException;
import cn.rc.flow.common.exception.ResourceConcurrentModificationException;
import cn.rc.flow.common.exception.ResourceNotFoundException;
import cn.rc.flow.common.exception.ResourceNotModifiedException;
import cn.rc.flow.common.utils.*;
import cn.rc.flow.dao.GroupMapper;
import cn.rc.flow.dao.UserGroupMemberMapper;
import cn.rc.flow.dao.UserMapper;
import cn.rc.flow.domain.*;
import cn.rc.flow.dto.SysIdNameDTO;
import cn.rc.flow.web.service.AbstractFlowService;
import cn.rc.flow.web.service.UserService;
import com.github.pagehelper.page.PageMethod;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Base64Utils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static cn.rc.flow.common.consts.ErrorMessageConsts.*;
import static cn.rc.flow.common.consts.RecordValueConsts.INIT_SYS_MOD_COUNT;
import static cn.rc.flow.common.consts.RecordValueConsts.NULL_DISPLAY_VALUE;
import static cn.rc.flow.common.enums.UserStatusEnum.ACTIVE;
import static cn.rc.flow.common.enums.UserStatusEnum.NOT_LOCKED_OUT;

/**
 * @author rc
 */
@Service
public class UserServiceImpl extends AbstractFlowService implements UserService {
    public static final String BASIC_AUTH_HEADER = "Basic ";

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserGroupMemberMapper userGroupMemberMapper;
    @Resource
    private GroupMapper groupMapper;

    @Override
    public User insert(User user, String createdBy) {
        isManagerIdValid(user.getManagerId());

        String sysId = UUIDUtil.getUUID();
        user.setSysId(sysId);
        user.setUserPassword(MD5Util.getMD5(user.getUserPassword()));
        user.setActive(ACTIVE.getCode());
        user.setLockedOut(NOT_LOCKED_OUT.getCode());
        user.setCreatedBy(createdBy);
        user.setCreatedTime(new Date());
        user.setSysModCount(INIT_SYS_MOD_COUNT);
        userMapper.insert(user);
        return userMapper.selectByPrimaryKey(sysId);
    }

    @Override
    public User get(String sysId) {
        User user = userMapper.selectByPrimaryKey(sysId);
        if (user == null) {
            throw new ResourceNotFoundException(USER_NOT_FOUND_MESSAGE);
        }
        return user;
    }

    @Override
    public SysIdNameDTO getSysIdAndName(String sysId) {
        User user = userMapper.selectByPrimaryKey(sysId);
        return new SysIdNameDTO()
                .setSysId(sysId)
                .setDisplayName(user == null ? NULL_DISPLAY_VALUE : user.getName());
    }

    @Override
    public List<User> listAll(int offset, int limit) {
        PageMethod.offsetPage(offset, limit);
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public List<User> listByCondition(String query, int offset, int limit) {
        QueryParser queryParser = new QueryParser(User.class, queryProperties.isIgnoreInvalidField());
        Query conditions = queryParser.parse(query);
        PageMethod.offsetPage(offset, limit);
        return userMapper.selectByQueryCondition(conditions);
    }

    @Override
    public User validateBasicAuthorization(String authHeader) {
        if (!authHeader.contains(BASIC_AUTH_HEADER)) {
            throw new AuthorizationFailedException(AUTH_METHOD_NOT_SUPPORTED_MESSAGE);
        }

        String encodedAuthInfo = authHeader.split(" ")[1];
        String decodedAuthInfo = new String(Base64Utils.decodeFromString(encodedAuthInfo));
        String username = decodedAuthInfo.split(":")[0];
        String password = MD5Util.getMD5(decodedAuthInfo.split(":")[1]);

        UserExample example = new UserExample();
        example.createCriteria()
                .andUserNameEqualTo(username)
                .andUserPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(example);

        if (userList.isEmpty()) {
            throw new AuthorizationFailedException(USERNAME_OR_PASSWORD_WRONG_MESSAGE);
        }
        return userList.get(0);
    }

    @Override
    @Transactional(rollbackFor = ResourceConcurrentModificationException.class, isolation = Isolation.READ_COMMITTED)
    public User updateSelective(String sysId, User user, String updatedBy) {
        int retryCount = 0;
        boolean retryable;

        checkUserInput(user);
        isManagerIdValid(user.getManagerId());
        user.setUpdatedBy(updatedBy);

        do {
            User originRecord = userMapper.selectByPrimaryKey(sysId);
            if (originRecord == null) {
                throw new ResourceNotFoundException(USER_NOT_FOUND_MESSAGE);
            }

            // get the current sys_mod_count
            Integer currentModCount = originRecord.getSysModCount();
            // sys_mod_count + 1 for the record to be updated
            user.setSysModCount(currentModCount + 1);
            user.setUpdatedTime(new Date());

            UserExample example = new UserExample();
            example.createCriteria()
                    .andSysIdEqualTo(sysId)
                    .andSysModCountEqualTo(currentModCount);

            int inserted = userMapper.updateByExampleSelective(user, example);

            if (inserted == 1) {
                return userMapper.selectByPrimaryKey(sysId);
            }

            // retry count + 1. If exceeded the maximum retires,
            // end the loop, throw an exception, and rollback
            retryable = ++retryCount < recordProperties.getMaxUpdateRetries();

        } while (retryable);

        throw new ResourceConcurrentModificationException(CONCURRENT_MODIFICATION_MESSAGE);
    }

    @Override
    public void delete(String sysId) {
        int deleted = userMapper.deleteByPrimaryKey(sysId);
        if (deleted == 0) {
            throw new ResourceNotFoundException(USER_NOT_FOUND_MESSAGE);
        }
    }

    @Override
    public List<SysIdNameDTO> getMembersSysIdAndNameList(String groupSysId) {

        // get group members
        UserGroupMemberExample example = new UserGroupMemberExample();
        example.createCriteria().andGroupIdEqualTo(groupSysId);
        List<UserGroupMember> memberList = userGroupMemberMapper.selectByExample(example);

        if (memberList.isEmpty()) {
            return Collections.emptyList();
        }

        // get name from member's user id
        List<SysIdNameDTO> dtoList = new ArrayList<>();
        for (UserGroupMember member : memberList) {
            dtoList.add(this.getSysIdAndName(member.getUserId()));
        }

        return dtoList;
    }

    @Override
    public List<Group> listUserGroups(String sysId) {
        User user = userMapper.selectByPrimaryKey(sysId);
        if (user == null) {
            throw new ResourceNotFoundException(USER_NOT_FOUND_MESSAGE);
        }

        UserGroupMemberExample example = new UserGroupMemberExample();
        example.createCriteria()
                .andUserIdEqualTo(sysId);
        List<UserGroupMember> memberList = userGroupMemberMapper.selectByExample(example);
        if (memberList.isEmpty()) {
            return Collections.emptyList();
        }

        List<Group> groupList = new ArrayList<>();
        for (UserGroupMember member : memberList) {
            Group group = groupMapper.selectByPrimaryKey(member.getGroupId());
            if (group == null) {
                group = new Group();
                group.setSysId(member.getGroupId());
            }
            groupList.add(group);
        }

        return groupList;
    }

    private static void checkUserInput(User user) {
        // below fields are not allow to be modified
        user.setSysId(null);
        user.setUserName(null);
        user.setCreatedBy(null);
        user.setCreatedTime(null);

        if (ObjectUtil.isObjectAllFieldsNull(user)) {
            throw new ResourceNotModifiedException();
        }

        String password = user.getUserPassword();
        if (password != null && !password.isBlank()) {
            user.setUserPassword(MD5Util.getMD5(password));
        }
    }
}
