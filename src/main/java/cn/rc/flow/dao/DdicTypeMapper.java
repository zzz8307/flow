package cn.rc.flow.dao;

import cn.rc.flow.domain.DdicType;
import cn.rc.flow.domain.DdicTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DdicTypeMapper {
    long countByExample(DdicTypeExample example);

    int deleteByExample(DdicTypeExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(DdicType record);

    int insertSelective(DdicType record);

    List<DdicType> selectByExample(DdicTypeExample example);

    DdicType selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") DdicType record, @Param("example") DdicTypeExample example);

    int updateByExample(@Param("record") DdicType record, @Param("example") DdicTypeExample example);

    int updateByPrimaryKeySelective(DdicType record);

    int updateByPrimaryKey(DdicType record);
}