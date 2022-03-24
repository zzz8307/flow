package cn.rc.flow.vo.factory;

import cn.rc.flow.domain.Problem;
import cn.rc.flow.vo.ProblemVO;
import cn.rc.flow.vo.converter.IncidentNumberShortDescConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static cn.rc.flow.common.consts.TableNameConsts.TABLE_PROBLEM;

/**
 * @author rc
 */
@Component
public class ProblemVoFactory extends AbstractVoFactory {

    private static final String FIELD_STATE = "_state";
    private static final String FIELD_CATEGORY = "_category";
    private static final String FIELD_PRIORITY = "_priority";

    @Resource
    private IncidentNumberShortDescConverter incidentConverter;

    public ProblemVO getVO(Problem problem) {
        if (problem == null) {
            return null;
        }

        return new ProblemVO()
                .setSysId(problem.getSysId())
                .setNumber(problem.getNumber())
                .setFirstReportedByTask(incidentConverter.convert(problem.getFirstReportedByTask()))
                .setState(valueConverter.convert(TABLE_PROBLEM + FIELD_STATE, problem.getState().toString()))
                .setPriority(valueConverter.convert(TABLE_PROBLEM + FIELD_PRIORITY, problem.getPriority().toString()))
                .setCategory(valueConverter.convert(TABLE_PROBLEM + FIELD_CATEGORY, problem.getCategory()))
                .setCmdbCi(problem.getCmdbCi())
                .setAssignmentGroup(groupConverter.convert(problem.getAssignmentGroup()))
                .setAssignedTo(userConverter.convert(problem.getAssignedTo()))
                .setShortDescription(problem.getShortDescription())
                .setWorkaround(problem.getWorkaround())
                .setCauseNotes(problem.getCauseNotes())
                .setFixNotes(problem.getFixNotes())
                .setResolvedBy(userConverter.convert(problem.getResolvedBy()))
                .setResolvedTime(problem.getResolvedTime())
                .setCreatedBy(userConverter.convert(problem.getCreatedBy()))
                .setCreatedTime(problem.getCreatedTime())
                .setUpdatedBy(userConverter.convert(problem.getUpdatedBy()))
                .setUpdatedTime(problem.getUpdatedTime())
                .setSysModCount(problem.getSysModCount());
    }
}
