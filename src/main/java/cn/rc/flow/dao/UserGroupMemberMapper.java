package cn.rc.flow.dao;

import cn.rc.flow.domain.UserGroupMember;
import cn.rc.flow.domain.UserGroupMemberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupMemberMapper {
    long countByExample(UserGroupMemberExample example);

    int deleteByExample(UserGroupMemberExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(UserGroupMember record);

    int insertSelective(UserGroupMember record);

    List<UserGroupMember> selectByExample(UserGroupMemberExample example);

    UserGroupMember selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") UserGroupMember record, @Param("example") UserGroupMemberExample example);

    int updateByExample(@Param("record") UserGroupMember record, @Param("example") UserGroupMemberExample example);

    int updateByPrimaryKeySelective(UserGroupMember record);

    int updateByPrimaryKey(UserGroupMember record);
}