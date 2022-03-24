package cn.rc.flow.dao;

import cn.rc.flow.domain.Number;
import cn.rc.flow.domain.NumberExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NumberMapper {
    long countByExample(NumberExample example);

    int deleteByExample(NumberExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(Number record);

    int insertSelective(Number record);

    List<Number> selectByExample(NumberExample example);

    Number selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") Number record, @Param("example") NumberExample example);

    int updateByExample(@Param("record") Number record, @Param("example") NumberExample example);

    int updateByPrimaryKeySelective(Number record);

    int updateByPrimaryKey(Number record);
}