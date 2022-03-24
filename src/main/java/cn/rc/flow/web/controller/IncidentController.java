package cn.rc.flow.web.controller;

import cn.rc.flow.common.annotation.LogExecutionTime;
import cn.rc.flow.common.annotation.apiCallHistoryLogger;
import cn.rc.flow.domain.Activity;
import cn.rc.flow.domain.Incident;
import cn.rc.flow.vo.IncidentVO;
import cn.rc.flow.vo.factory.IncidentVoFactory;
import cn.rc.flow.web.service.ActivityService;
import cn.rc.flow.web.service.IncidentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rc
 */
@apiCallHistoryLogger
@LogExecutionTime
@RestController
@RequestMapping("/incidents")
public class IncidentController extends AbstractFlowController implements BaseController<Incident> {

    @Resource
    private IncidentService incidentService;
    @Resource
    private ActivityService activityService;

    @Resource
    private IncidentVoFactory incidentVoFactory;

    @Override
    @GetMapping
    public ResponseEntity<Object> listRecords(@RequestParam(value = "query", required = false) String query,
                                              @RequestParam(value = "offset", required = false) Integer ofs,
                                              @RequestParam(value = "limit", required = false) Integer lim,
                                              @RequestParam(required = false) Boolean displayValue) {
        int offset = ofs == null ? 0 : ofs;
        int limit = lim == null ? 100 : lim;

        List<Incident> list = (query == null || query.isBlank())
                ? incidentService.listAll(offset, limit)
                : incidentService.listByCondition(query, offset, limit);

        if (Boolean.TRUE.equals(displayValue)) {
            List<IncidentVO> voList = new ArrayList<>();
            list.forEach(incident -> voList.add(incidentVoFactory.getVO(incident)));
            return new ResponseEntity<>(voList, HttpStatus.OK);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{sysId}")
    public ResponseEntity<Object> getRecord(@PathVariable String sysId,
                                            @RequestParam(required = false) Boolean displayValue) {
        Incident incident = incidentService.get(sysId);

        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(incidentVoFactory.getVO(incident), HttpStatus.OK)
                : new ResponseEntity<>(incident, HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<Object> insertRecord(HttpServletRequest request,
                                               @Valid Incident incident,
                                               @RequestParam(required = false) Boolean displayValue) {
        String createdBy = getSessionUser(request).getSysId();
        Incident insertedIncident = incidentService.insert(incident, createdBy);

        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(incidentVoFactory.getVO(insertedIncident), HttpStatus.CREATED)
                : new ResponseEntity<>(insertedIncident, HttpStatus.CREATED);
    }

    @Override
    @PatchMapping("/{sysId}")
    public ResponseEntity<Object> updateRecord(HttpServletRequest request,
                                               @PathVariable String sysId,
                                               Incident incident,
                                               @RequestParam(required = false) Boolean displayValue) {
        String updatedBy = getSessionUser(request).getSysId();
        Incident updatedIncident = incidentService.updateSelective(sysId, incident, updatedBy);

        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(incidentVoFactory.getVO(updatedIncident), HttpStatus.OK)
                : new ResponseEntity<>(updatedIncident, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{sysId}")
    public ResponseEntity<Object> deleteRecord(@PathVariable String sysId) {
        incidentService.delete(sysId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{sysId}/activities")
    public ResponseEntity<Object> listActivities(@PathVariable String sysId) {
        List<Activity> list = activityService.listActivities(sysId);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PutMapping("/{sysId}/activities")
    public ResponseEntity<Object> insertActivity(HttpServletRequest request,
                                                 @PathVariable String sysId,
                                                 @Valid Activity activity) {
        String createdBy = getSessionUser(request).getSysId();
        Activity insertedActivity = activityService.insertActivity(activity, sysId, createdBy);
        return new ResponseEntity<>(insertedActivity, HttpStatus.CREATED);
    }
}
