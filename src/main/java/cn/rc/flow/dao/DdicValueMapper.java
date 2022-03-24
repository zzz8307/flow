package cn.rc.flow.dao;

import cn.rc.flow.domain.DdicValue;
import cn.rc.flow.domain.DdicValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DdicValueMapper {
    long countByExample(DdicValueExample example);

    int deleteByExample(DdicValueExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(DdicValue record);

    int insertSelective(DdicValue record);

    List<DdicValue> selectByExample(DdicValueExample example);

    DdicValue selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") DdicValue record, @Param("example") DdicValueExample example);

    int updateByExample(@Param("record") DdicValue record, @Param("example") DdicValueExample example);

    int updateByPrimaryKeySelective(DdicValue record);

    int updateByPrimaryKey(DdicValue record);
}