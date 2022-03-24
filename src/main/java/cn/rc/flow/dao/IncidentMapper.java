package cn.rc.flow.dao;

import cn.rc.flow.common.utils.Query;
import cn.rc.flow.domain.Incident;
import cn.rc.flow.domain.IncidentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IncidentMapper {
    long countByExample(IncidentExample example);

    int deleteByExample(IncidentExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(Incident record);

    int insertSelective(Incident record);

    List<Incident> selectByExample(IncidentExample example);

    Incident selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") Incident record, @Param("example") IncidentExample example);

    int updateByExample(@Param("record") Incident record, @Param("example") IncidentExample example);

    int updateByPrimaryKeySelective(Incident record);

    int updateByPrimaryKey(Incident record);

    List<Incident> selectByQueryCondition(Query query);
}