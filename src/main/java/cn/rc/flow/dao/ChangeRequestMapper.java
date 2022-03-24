package cn.rc.flow.dao;

import cn.rc.flow.domain.ChangeRequest;
import cn.rc.flow.domain.ChangeRequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChangeRequestMapper {
    long countByExample(ChangeRequestExample example);

    int deleteByExample(ChangeRequestExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(ChangeRequest record);

    int insertSelective(ChangeRequest record);

    List<ChangeRequest> selectByExample(ChangeRequestExample example);

    ChangeRequest selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") ChangeRequest record, @Param("example") ChangeRequestExample example);

    int updateByExample(@Param("record") ChangeRequest record, @Param("example") ChangeRequestExample example);

    int updateByPrimaryKeySelective(ChangeRequest record);

    int updateByPrimaryKey(ChangeRequest record);
}