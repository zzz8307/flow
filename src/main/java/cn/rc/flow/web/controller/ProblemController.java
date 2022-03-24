package cn.rc.flow.web.controller;

import cn.rc.flow.common.annotation.LogExecutionTime;
import cn.rc.flow.common.annotation.apiCallHistoryLogger;
import cn.rc.flow.domain.Activity;
import cn.rc.flow.domain.Problem;
import cn.rc.flow.vo.ProblemVO;
import cn.rc.flow.vo.factory.ProblemVoFactory;
import cn.rc.flow.web.service.ActivityService;
import cn.rc.flow.web.service.ProblemService;
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
@RequestMapping("/problems")
public class ProblemController extends AbstractFlowController implements BaseController<Problem> {

    @Resource
    private ProblemService problemService;
    @Resource
    private ActivityService activityService;

    @Resource
    private ProblemVoFactory problemVoFactory;

    @Override
    @GetMapping
    public ResponseEntity<Object> listRecords(@RequestParam(value = "query", required = false) String query,
                                              @RequestParam(value = "offset", required = false) Integer ofs,
                                              @RequestParam(value = "limit", required = false) Integer lim,
                                              @RequestParam(required = false) Boolean displayValue) {
        int offset = ofs == null ? 0 : ofs;
        int limit = lim == null ? 100 : lim;

        List<Problem> list = (query == null || query.isBlank())
                ? problemService.listAll(offset, limit)
                : problemService.listByCondition(query, offset, limit);

        if (Boolean.TRUE.equals(displayValue)) {
            List<ProblemVO> voList = new ArrayList<>();
            list.forEach(problem -> voList.add(problemVoFactory.getVO(problem)));
            return new ResponseEntity<>(voList, HttpStatus.OK);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{sysId}")
    public ResponseEntity<Object> getRecord(@PathVariable String sysId,
                                            @RequestParam(required = false) Boolean displayValue) {
        Problem problem = problemService.get(sysId);

        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(problemVoFactory.getVO(problem), HttpStatus.CREATED)
                : new ResponseEntity<>(problem, HttpStatus.CREATED);
    }

    @Override
    @PostMapping
    public ResponseEntity<Object> insertRecord(HttpServletRequest request,
                                               @Valid Problem problem,
                                               @RequestParam(required = false) Boolean displayValue) {
        String createBy = getSessionUser(request).getSysId();
        Problem insertedProblem = problemService.insert(problem, createBy);

        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(problemVoFactory.getVO(insertedProblem), HttpStatus.CREATED)
                : new ResponseEntity<>(insertedProblem, HttpStatus.CREATED);
    }

    @Override
    @PatchMapping("/{sysId}")
    public ResponseEntity<Object> updateRecord(HttpServletRequest request,
                                               @PathVariable String sysId,
                                               Problem problem,
                                               @RequestParam(required = false) Boolean displayValue) {
        String updatedBy = getSessionUser(request).getSysId();
        Problem updatedProblem = problemService.updateSelective(sysId, problem, updatedBy);
        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(problemVoFactory.getVO(updatedProblem), HttpStatus.CREATED)
                : new ResponseEntity<>(updatedProblem, HttpStatus.CREATED);
    }

    @Override
    @DeleteMapping("/{sysId}")
    public ResponseEntity<Object> deleteRecord(@PathVariable String sysId) {
        problemService.delete(sysId);
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
