package cn.rc.flow.dao;

import cn.rc.flow.common.utils.Query;
import cn.rc.flow.domain.Problem;
import cn.rc.flow.domain.ProblemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProblemMapper {
    long countByExample(ProblemExample example);

    int deleteByExample(ProblemExample example);

    int deleteByPrimaryKey(String sysId);

    int insert(Problem record);

    int insertSelective(Problem record);

    List<Problem> selectByExample(ProblemExample example);

    Problem selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKey(Problem record);

    List<Problem> selectByQueryCondition(Query conditions, int offset, int limit);
}