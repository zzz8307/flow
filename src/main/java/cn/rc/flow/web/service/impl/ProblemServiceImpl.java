package cn.rc.flow.web.service.impl;

import cn.rc.flow.common.exception.ResourceConcurrentModificationException;
import cn.rc.flow.common.exception.ResourceNotFoundException;
import cn.rc.flow.common.exception.ResourceNotModifiedException;
import cn.rc.flow.common.properties.QueryProperties;
import cn.rc.flow.common.properties.RecordProperties;
import cn.rc.flow.common.utils.ObjectUtil;
import cn.rc.flow.common.utils.Query;
import cn.rc.flow.common.utils.QueryParser;
import cn.rc.flow.common.utils.UUIDUtil;
import cn.rc.flow.dao.ProblemMapper;
import cn.rc.flow.domain.Problem;
import cn.rc.flow.domain.ProblemExample;
import cn.rc.flow.dto.NumberShortDescDTO;
import cn.rc.flow.web.service.NumberService;
import cn.rc.flow.web.service.ProblemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static cn.rc.flow.common.consts.ErrorMessageConsts.*;
import static cn.rc.flow.common.consts.RecordValueConsts.INIT_SYS_MOD_COUNT;
import static cn.rc.flow.common.consts.TableNameConsts.TABLE_PROBLEM;

/**
 * @author rc
 */
@Service
public class ProblemServiceImpl implements ProblemService {

    @Resource
    private ProblemMapper problemMapper;
    @Resource
    private NumberService numberService;

    @Resource
    private RecordProperties recordProperties;
    @Resource
    private QueryProperties queryProperties;

    @Override
    public NumberShortDescDTO getNumberShortDesc(String sysId) {
        Problem problem = problemMapper.selectByPrimaryKey(sysId);
        return new NumberShortDescDTO()
                .setNumber(problem.getNumber())
                .setShortDescription(problem.getShortDescription());
    }

    @Override
    public List<Problem> listAll(int offset, int limit) {
        return problemMapper.selectByExample(new ProblemExample());
    }

    @Override
    public List<Problem> listByCondition(String query, int offset, int limit) {
        QueryParser queryParser = new QueryParser(Problem.class, queryProperties.isIgnoreInvalidField());
        Query conditions = queryParser.parse(query);
        return problemMapper.selectByQueryCondition(conditions, offset, limit);
    }

    @Override
    public Problem insert(Problem problem, String createBy) {
        String sysId = UUIDUtil.getUUID();
        problem.setSysId(sysId);
        problem.setNumber(numberService.getNextNumber(TABLE_PROBLEM, createBy));
        problem.setCreatedBy(createBy);
        problem.setCreatedTime(new Date());
        problem.setSysModCount(INIT_SYS_MOD_COUNT);

        if (problem.getState() == null) {
            problem.setState(1);
        }
        if (problem.getPriority() == null) {
            problem.setPriority(3);
        }

        problemMapper.insertSelective(problem);
        return problemMapper.selectByPrimaryKey(sysId);
    }

    @Override
    public Problem get(String sysId) {
        Problem problem = problemMapper.selectByPrimaryKey(sysId);
        if (problem == null) {
            throw new ResourceNotFoundException(PROBLEM_NOT_FOUND_MESSAGE);
        }
        return problem;
    }

    @Override
    public Problem updateSelective(String sysId, Problem problem, String updatedBy) {
        int retryCount = 0;
        boolean retryable;

        checkUserInput(problem);
        problem.setUpdatedBy(updatedBy);

        do {
            Problem originRecord = problemMapper.selectByPrimaryKey(sysId);
            if (originRecord == null) {
                throw new ResourceNotFoundException(INCIDENT_NOT_FOUND_MESSAGE);
            }

            Integer currentModCount = originRecord.getSysModCount();
            problem.setSysModCount(currentModCount + 1);
            problem.setUpdatedTime(new Date());

            ProblemExample example = new ProblemExample();
            example.createCriteria()
                    .andSysIdEqualTo(sysId)
                    .andSysModCountEqualTo(currentModCount);

            int inserted = problemMapper.updateByExampleSelective(problem, example);

            if (inserted == 1) {
                return problemMapper.selectByPrimaryKey(sysId);
            }

            retryable = ++retryCount < recordProperties.getMaxUpdateRetries();

        } while (retryable);

        throw new ResourceConcurrentModificationException(CONCURRENT_MODIFICATION_MESSAGE);
    }

    @Override
    public void delete(String sysId) {
        int deleted = problemMapper.deleteByPrimaryKey(sysId);
        if (deleted == 0) {
            throw new ResourceNotFoundException(PROBLEM_NOT_FOUND_MESSAGE);
        }
    }

    private static void checkUserInput(Problem problem) {
        // below fields are not allow to be modified
        problem.setSysId(null);
        problem.setNumber(null);
        problem.setCreatedTime(null);
        problem.setCreatedBy(null);

        if (ObjectUtil.isObjectAllFieldsNull(problem)) {
            throw new ResourceNotModifiedException();
        }
    }
}
