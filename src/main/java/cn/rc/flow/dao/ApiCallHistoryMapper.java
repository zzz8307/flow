package cn.rc.flow.dao;

import cn.rc.flow.domain.ApiCallHistory;
import cn.rc.flow.domain.ApiCallHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApiCallHistoryMapper {
    long countByExample(ApiCallHistoryExample example);

    int deleteByExample(ApiCallHistoryExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(ApiCallHistory record);

    int insertSelective(ApiCallHistory record);

    List<ApiCallHistory> selectByExample(ApiCallHistoryExample example);

    ApiCallHistory selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") ApiCallHistory record, @Param("example") ApiCallHistoryExample example);

    int updateByExample(@Param("record") ApiCallHistory record, @Param("example") ApiCallHistoryExample example);

    int updateByPrimaryKeySelective(ApiCallHistory record);

    int updateByPrimaryKey(ApiCallHistory record);
}