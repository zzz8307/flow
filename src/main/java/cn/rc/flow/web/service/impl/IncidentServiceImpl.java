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
import cn.rc.flow.dao.IncidentMapper;
import cn.rc.flow.domain.Incident;
import cn.rc.flow.domain.IncidentExample;
import cn.rc.flow.dto.NumberShortDescDTO;
import cn.rc.flow.web.service.IncidentService;
import cn.rc.flow.web.service.NumberService;
import com.github.pagehelper.page.PageMethod;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

import static cn.rc.flow.common.consts.ErrorMessageConsts.CONCURRENT_MODIFICATION_MESSAGE;
import static cn.rc.flow.common.consts.ErrorMessageConsts.INCIDENT_NOT_FOUND_MESSAGE;
import static cn.rc.flow.common.consts.RecordValueConsts.INIT_SYS_MOD_COUNT;
import static cn.rc.flow.common.consts.TableNameConsts.TABLE_INCIDENT;

/**
 * @author rc
 */
@Service
public class IncidentServiceImpl implements IncidentService {

    @Resource
    private IncidentMapper incidentMapper;
    @Resource
    private NumberService numberService;

    @Resource
    private RecordProperties recordProperties;
    @Resource
    private QueryProperties queryProperties;

    @Override
    public List<Incident> listAll(int offset, int limit) {
        return incidentMapper.selectByExample(new IncidentExample());
    }

    @Override
    public List<Incident> listByCondition(String query, int offset, int limit) {
        QueryParser queryParser = new QueryParser(Incident.class, queryProperties.isIgnoreInvalidField());
        Query conditions = queryParser.parse(query);
        PageMethod.offsetPage(offset, limit);
        return incidentMapper.selectByQueryCondition(conditions);
    }

    @Override
    public NumberShortDescDTO getNumberShortDesc(String sysId) {
        Incident incident = incidentMapper.selectByPrimaryKey(sysId);
        return new NumberShortDescDTO()
                .setNumber(incident.getNumber())
                .setShortDescription(incident.getShortDescription());
    }

    @Override
    public Incident insert(Incident incident, String createdBy) {
        String sysId = UUIDUtil.getUUID();
        incident.setSysId(sysId);
        incident.setNumber(numberService.getNextNumber(TABLE_INCIDENT, createdBy));
        incident.setCallerId(createdBy);
        incident.setCreatedBy(createdBy);
        incident.setCreatedTime(new Date());
        incident.setSysModCount(INIT_SYS_MOD_COUNT);

        if (incident.getState() == null) {
            incident.setState(1);
        }
        if (incident.getPriority() == null) {
            incident.setPriority(3);
        }
        if (incident.getShortDescription() == null || incident.getShortDescription().isBlank()) {
            incident.setShortDescription(incident.getDescription());
        }

        incidentMapper.insertSelective(incident);
        return incidentMapper.selectByPrimaryKey(sysId);
    }

    @Override
    public Incident get(String sysId) {
        Incident incident = incidentMapper.selectByPrimaryKey(sysId);
        if (incident == null) {
            throw new ResourceNotFoundException(INCIDENT_NOT_FOUND_MESSAGE);
        }
        return incident;
    }

    @Override
    @Transactional(rollbackFor = ResourceConcurrentModificationException.class, isolation = Isolation.READ_COMMITTED)
    public Incident updateSelective(String sysId, Incident incident, String updatedBy) {
        int retryCount = 0;
        boolean retryable;

        checkUserInput(incident);
        incident.setUpdatedBy(updatedBy);

        do {
            Incident originRecord = incidentMapper.selectByPrimaryKey(sysId);
            if (originRecord == null) {
                throw new ResourceNotFoundException(INCIDENT_NOT_FOUND_MESSAGE);
            }

            Integer currentModCount = originRecord.getSysModCount();
            incident.setSysModCount(currentModCount + 1);
            incident.setUpdatedTime(new Date());

            IncidentExample example = new IncidentExample();
            example.createCriteria()
                    .andSysIdEqualTo(sysId)
                    .andSysModCountEqualTo(currentModCount);

            int inserted = incidentMapper.updateByExampleSelective(incident, example);

            if (inserted == 1) {
                return incidentMapper.selectByPrimaryKey(sysId);
            }

            retryable = ++retryCount < recordProperties.getMaxUpdateRetries();

        } while (retryable);

        throw new ResourceConcurrentModificationException(CONCURRENT_MODIFICATION_MESSAGE);
    }

    @Override
    public void delete(String sysId) {
        int deleted = incidentMapper.deleteByPrimaryKey(sysId);
        if (deleted == 0) {
            throw new ResourceNotFoundException(INCIDENT_NOT_FOUND_MESSAGE);
        }
    }

    private static void checkUserInput(Incident incident) {
        // below fields are not allow to be modified
        incident.setSysId(null);
        incident.setNumber(null);
        incident.setCreatedTime(null);
        incident.setCreatedBy(null);

        if (ObjectUtil.isObjectAllFieldsNull(incident)) {
            throw new ResourceNotModifiedException();
        }
    }
}
