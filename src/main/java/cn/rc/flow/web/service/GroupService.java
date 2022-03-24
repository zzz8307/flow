package cn.rc.flow.web.service;

import cn.rc.flow.domain.Group;
import cn.rc.flow.domain.User;
import cn.rc.flow.dto.SysIdNameDTO;

import java.util.List;

/**
 * @author rc
 */
public interface GroupService extends BaseService<Group> {
    /**
     * Get name by sys id
     * @param sysId Group id
     * @return Group id and name
     */
    SysIdNameDTO getSysIdAndName(String sysId);

    /**
     * Get group name and id by user id
     * @param userSysId User id
     * @return Group id and name
     */
    List<SysIdNameDTO> getGroupsSysIdAndNameList(String userSysId);

    /**
     * Get member by group id
     * @param groupId Group SysId
     * @return Member list
     */
    List<User> listMembers(String groupId);

    /**
     * Insert a member to a group
     * @param groupId Group SysId
     * @param userId User SysId
     * @param createdBy Sys id of the user who initiated the request
     */
    void insertMember(String groupId, String userId, String createdBy);

    /**
     * Delete a member from a group
     * @param groupId Group SysId
     * @param userId User SysId
     */
    void deleteMember(String groupId, String userId);
}
