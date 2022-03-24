package cn.rc.flow.vo.factory;

import cn.rc.flow.domain.Incident;
import cn.rc.flow.vo.IncidentVO;
import cn.rc.flow.vo.converter.ProblemNumberShortDescConverter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static cn.rc.flow.common.consts.TableNameConsts.TABLE_INCIDENT;

/**
 * @author rc
 */
@Component
public class IncidentVoFactory extends AbstractVoFactory {

    private static final String FIELD_CONTACT_TYPE = "_contact_type";
    private static final String FIELD_STATE = "_state";
    private static final String FIELD_PRIORITY = "_priority";
    private static final String FIELD_CATEGORY = "_category";
    private static final String FIELD_SYMPTOM = "_symptom";
    private static final String FIELD_HOLD_REASON = "_hold_reason";
    private static final String FIELD_CLOSE_CODE = "_close_code";
    private static final String FIELD_CAUSE_CODE = "_cause_code";

    @Resource
    private ProblemNumberShortDescConverter problemConverter;

    public IncidentVO getVO(Incident incident) {
        if (incident == null) {
            return null;
        }

        return new IncidentVO()
                .setSysId(incident.getSysId())
                .setNumber(incident.getNumber())
                .setCaller(userConverter.convert(incident.getCallerId()))
                .setOpenedFor(userConverter.convert(incident.getOpenedFor()))
                .setContactType(valueConverter.convert(TABLE_INCIDENT + FIELD_CONTACT_TYPE, incident.getContactType()))
                .setState(valueConverter.convert(TABLE_INCIDENT + FIELD_STATE, incident.getState().toString()))
                .setPriority(valueConverter.convert(TABLE_INCIDENT + FIELD_PRIORITY, incident.getPriority().toString()))
                .setCategory(valueConverter.convert(TABLE_INCIDENT + FIELD_CATEGORY, incident.getCategory()))
                .setSymptom(valueConverter.convert(TABLE_INCIDENT + FIELD_SYMPTOM, incident.getSymptom()))
                .setCmdbCi(incident.getCmdbCi())
                .setHoldReason(valueConverter.convert(TABLE_INCIDENT + FIELD_HOLD_REASON, incident.getHoldReason()))
                .setPendingTime(incident.getPendingTime())
                .setOwnershipGroup(groupConverter.convert(incident.getOwnershipGroup()))
                .setAssignmentGroup(groupConverter.convert(incident.getAssignmentGroup()))
                .setAssignedTo(userConverter.convert(incident.getAssignedTo()))
                .setCorrelationId(incident.getCorrelationId())
                .setShortDescription(incident.getShortDescription())
                .setDescription(incident.getDescription())
                .setProblem(problemConverter.convert(incident.getProblemId()))
                .setCloseCode(valueConverter.convert(TABLE_INCIDENT + FIELD_CLOSE_CODE, incident.getCloseCode()))
                .setCloseNotes(incident.getCloseNotes())
                .setCauseCode(valueConverter.convert(TABLE_INCIDENT + FIELD_CAUSE_CODE, incident.getCauseCode()))
                .setClosedBy(userConverter.convert(incident.getClosedBy()))
                .setClosedTime(incident.getClosedTime())
                .setCreatedBy(userConverter.convert(incident.getCreatedBy()))
                .setCreatedTime(incident.getCreatedTime())
                .setUpdatedBy(userConverter.convert(incident.getUpdatedBy()))
                .setUpdatedTime(incident.getUpdatedTime())
                .setSysModCount(incident.getSysModCount());
    }
}
