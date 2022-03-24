package cn.rc.flow.web.service;

import cn.rc.flow.domain.Group;
import cn.rc.flow.domain.User;
import cn.rc.flow.dto.SysIdNameDTO;

import java.util.List;

/**
 * @author rc
 */
public interface UserService extends BaseService<User> {
    /**
     * Basic authorization
     * @param authHeader Authorization header
     * @return Login user info, {@code null} if authorization failed.
     */
    User validateBasicAuthorization(String authHeader);

    /**
     * Get name by sys id
     * @param sysId User id
     * @return {@code SysIdAndNameVO<User>} object
     */
    SysIdNameDTO getSysIdAndName(String sysId);

    /**
     * Get members by group id
     * @param groupSysId Group id
     * @return Username and id
     */
    List<SysIdNameDTO> getMembersSysIdAndNameList(String groupSysId);

    /**
     * Get user's group by user id
     * @param sysId User id
     * @return Group list, {@code null} if none.
     */
    List<Group> listUserGroups(String sysId);
}
