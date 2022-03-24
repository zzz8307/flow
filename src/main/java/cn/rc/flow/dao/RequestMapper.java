package cn.rc.flow.dao;

import cn.rc.flow.domain.Request;
import cn.rc.flow.domain.RequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RequestMapper {
    long countByExample(RequestExample example);

    int deleteByExample(RequestExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(Request record);

    int insertSelective(Request record);

    List<Request> selectByExample(RequestExample example);

    Request selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") Request record, @Param("example") RequestExample example);

    int updateByExample(@Param("record") Request record, @Param("example") RequestExample example);

    int updateByPrimaryKeySelective(Request record);

    int updateByPrimaryKey(Request record);
}