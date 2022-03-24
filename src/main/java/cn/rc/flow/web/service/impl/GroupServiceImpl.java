package cn.rc.flow.web.service.impl;

import cn.rc.flow.common.consts.RecordValueConsts;
import cn.rc.flow.common.exception.ResourceConcurrentModificationException;
import cn.rc.flow.common.exception.ResourceNotFoundException;
import cn.rc.flow.common.exception.ResourceNotModifiedException;
import cn.rc.flow.common.properties.QueryProperties;
import cn.rc.flow.common.utils.ObjectUtil;
import cn.rc.flow.common.utils.Query;
import cn.rc.flow.common.utils.QueryParser;
import cn.rc.flow.common.utils.UUIDUtil;
import cn.rc.flow.dao.GroupMapper;
import cn.rc.flow.dao.UserGroupMemberMapper;
import cn.rc.flow.dao.UserMapper;
import cn.rc.flow.domain.*;
import cn.rc.flow.dto.SysIdNameDTO;
import cn.rc.flow.web.service.AbstractFlowService;
import cn.rc.flow.web.service.GroupService;
import com.github.pagehelper.page.PageMethod;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static cn.rc.flow.common.consts.ErrorMessageConsts.*;
import static cn.rc.flow.common.consts.RecordValueConsts.INIT_SYS_MOD_COUNT;

/**
 * @author rc
 */
@Service
public class GroupServiceImpl extends AbstractFlowService implements GroupService {

    @Resource
    private GroupMapper groupMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserGroupMemberMapper userGroupMemberMapper;

    @Resource
    private QueryProperties queryProperties;

    @Override
    public Group insert(Group group, String createdBy) {
        checkUserInput(group);
        isManagerIdValid(group.getManagerId());

        String sysId = UUIDUtil.getUUID();
        group.setSysId(sysId);
        group.setCreatedBy(createdBy);
        group.setCreatedTime(new Date());
        group.setSysModCount(INIT_SYS_MOD_COUNT);
        groupMapper.insert(group);
        return groupMapper.selectByPrimaryKey(sysId);
    }

    @Override
    public SysIdNameDTO getSysIdAndName(String sysId) {
        Group group = groupMapper.selectByPrimaryKey(sysId);
        return new SysIdNameDTO()
                .setSysId(sysId)
                .setDisplayName(group == null ? RecordValueConsts.NULL_DISPLAY_VALUE : group.getName());
    }

    @Override
    public List<SysIdNameDTO> getGroupsSysIdAndNameList(String userSysId) {

        // Get groups to which user belongs
        UserGroupMemberExample example = new UserGroupMemberExample();
        example.createCriteria().andUserIdEqualTo(userSysId);
        List<UserGroupMember> memberList = userGroupMemberMapper.selectByExample(example);

        if (memberList.isEmpty()) {
            return Collections.emptyList();
        }

        // Get group name by sys id
        List<SysIdNameDTO> dtoList = new ArrayList<>();
        for (UserGroupMember member : memberList) {
            dtoList.add(this.getSysIdAndName(member.getGroupId()));
        }

        return dtoList;
    }

    @Override
    public List<Group> listAll(int offset, int limit) {
        PageMethod.offsetPage(offset, limit);
        return groupMapper.selectByExample(new GroupExample());
    }

    @Override
    public void delete(String sysId) {
        int deleted = groupMapper.deleteByPrimaryKey(sysId);
        if (deleted == 0) {
            throw new ResourceNotFoundException(GROUP_NOT_FOUND_MESSAGE);
        }
    }

    @Override
    @Transactional(rollbackFor = ResourceConcurrentModificationException.class, isolation = Isolation.READ_COMMITTED)
    public Group updateSelective(String sysId, Group group, String updatedBy) {
        int retryCount = 0;
        boolean retryable;

        checkUserInput(group);
        isManagerIdValid(group.getManagerId());
        group.setUpdatedBy(updatedBy);

        do {
            Group originRecord = groupMapper.selectByPrimaryKey(sysId);
            if (originRecord == null) {
                throw new ResourceNotFoundException(GROUP_NOT_FOUND_MESSAGE);
            }

            // Get the current mod count
            Integer currentModCount = originRecord.getSysModCount();
            // mod count + 1 for the record to be updated
            group.setSysModCount(currentModCount + 1);
            group.setUpdatedTime(new Date());

            GroupExample example = new GroupExample();
            example.createCriteria()
                    .andSysIdEqualTo(sysId)
                    .andSysModCountEqualTo(currentModCount);

            int inserted = groupMapper.updateByExampleSelective(group, example);

            if (inserted == 1) {
                return groupMapper.selectByPrimaryKey(sysId);
            }

            // retry count + 1. If exceeded the maximum retires,
            // end the loop, throw an exception, and rollback
            retryable = ++retryCount < recordProperties.getMaxUpdateRetries();

        } while (retryable);

        throw new ResourceConcurrentModificationException(CONCURRENT_MODIFICATION_MESSAGE);
    }

    @Override
    public Group get(String sysId) {
        Group group = groupMapper.selectByPrimaryKey(sysId);
        if (group == null) {
            throw new ResourceNotFoundException(GROUP_NOT_FOUND_MESSAGE);
        }
        return group;
    }

    @Override
    public List<User> listMembers(String groupId) {
        UserGroupMemberExample example = new UserGroupMemberExample();
        example.createCriteria()
                .andGroupIdEqualTo(groupId);
        List<UserGroupMember> userGroupList = userGroupMemberMapper.selectByExample(example);

        List<User> memberList = new ArrayList<>();
        for (UserGroupMember member : userGroupList) {
            User user = userMapper.selectByPrimaryKey(member.getUserId());
            if (user == null) {
                user = new User();
                user.setSysId(member.getUserId());
            }
            memberList.add(user);
        }

        return memberList;
    }

    @Override
    public void insertMember(String groupId, String userId, String createdBy) {
        Group group = groupMapper.selectByPrimaryKey(groupId);
        if (group == null) {
            throw new ResourceNotFoundException(GROUP_NOT_FOUND_MESSAGE);
        }

        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            throw new ResourceNotFoundException(USER_NOT_FOUND_MESSAGE);
        }

        UserGroupMemberExample example = new UserGroupMemberExample();
        example.createCriteria()
                .andGroupIdEqualTo(groupId)
                .andUserIdEqualTo(userId);
        List<UserGroupMember> list = userGroupMemberMapper.selectByExample(example);
        if (!list.isEmpty()) {
            throw new ResourceNotModifiedException();
        }

        UserGroupMember member = new UserGroupMember();
        member.setSysId(UUIDUtil.getUUID());
        member.setGroupId(groupId);
        member.setUserId(userId);
        member.setCreatedBy(createdBy);
        member.setCreatedTime(new Date());
        member.setSysModCount(INIT_SYS_MOD_COUNT);

        userGroupMemberMapper.insert(member);
    }

    @Override
    public void deleteMember(String groupId, String userId) {
        UserGroupMemberExample example = new UserGroupMemberExample();
        example.createCriteria()
                .andGroupIdEqualTo(groupId)
                .andUserIdEqualTo(userId);
        int deleted = userGroupMemberMapper.deleteByExample(example);
        if (deleted == 0) {
            throw new ResourceNotFoundException(MEMBER_NOT_FOUND_MESSAGE);
        }
    }

    @Override
    public List<Group> listByCondition(String query, int offset, int limit) {
        QueryParser queryParser = new QueryParser(Group.class, queryProperties.isIgnoreInvalidField());
        Query conditions = queryParser.parse(query);
        PageMethod.offsetPage(offset, limit);
        return groupMapper.selectByQueryCondition(conditions);
    }

    private static void checkUserInput(Group group) {
        // below fields are not allow to be modified
        group.setSysId(null);
        group.setCreatedBy(null);
        group.setCreatedTime(null);

        if (ObjectUtil.isObjectAllFieldsNull(group)) {
            throw new ResourceNotModifiedException();
        }
    }
}
