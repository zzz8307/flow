package cn.rc.flow.web.controller;

import cn.rc.flow.common.annotation.LogExecutionTime;
import cn.rc.flow.common.annotation.apiCallHistoryLogger;
import cn.rc.flow.domain.Group;
import cn.rc.flow.domain.User;
import cn.rc.flow.vo.GroupVO;
import cn.rc.flow.vo.UserVO;
import cn.rc.flow.vo.factory.GroupVoFactory;
import cn.rc.flow.vo.factory.UserVoFactory;
import cn.rc.flow.web.service.GroupService;
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
@RequestMapping("/groups")
public class GroupController extends AbstractFlowController implements BaseController<Group> {

    @Resource
    private GroupService groupService;

    @Resource
    private UserVoFactory userVoFactory;
    @Resource
    private GroupVoFactory groupVoFactory;

    @Override
    @GetMapping
    public ResponseEntity<Object> listRecords(@RequestParam(value = "query", required = false) String query,
                                              @RequestParam(value = "offset", required = false) Integer ofs,
                                              @RequestParam(value = "limit", required = false) Integer lim,
                                              @RequestParam(required = false) Boolean displayValue) {

        int offset = ofs == null ? 0 : ofs;
        int limit = lim == null ? 100 : lim;

        List<Group> list = (query == null || query.isBlank())
                ? groupService.listAll(offset, limit)
                : groupService.listByCondition(query, offset, limit);

        if (Boolean.TRUE.equals(displayValue)) {
            List<GroupVO> voList = new ArrayList<>();
            list.forEach(group -> voList.add(groupVoFactory.getVO(group)));
            return new ResponseEntity<>(voList, HttpStatus.OK);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    @GetMapping("/{sysId}")
    public ResponseEntity<Object> getRecord(@PathVariable String sysId,
                                            @RequestParam(required = false) Boolean displayValue) {
        Group group = groupService.get(sysId);
        GroupVO vo = groupVoFactory.getVO(group);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    @Override
    @PostMapping
    public ResponseEntity<Object> insertRecord(HttpServletRequest request,
                                               @Valid Group group,
                                               @RequestParam(required = false) Boolean displayValue) {
        String createdBy = getSessionUser(request).getSysId();
        Group savedGroup = groupService.insert(group, createdBy);
        GroupVO vo = groupVoFactory.getVO(savedGroup);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }

    @Override
    @PatchMapping("/{sysId}")
    public ResponseEntity<Object> updateRecord(HttpServletRequest request, @PathVariable String sysId,
                                               Group group,
                                               @RequestParam(required = false) Boolean displayValue) {
        String updatedBy = getSessionUser(request).getSysId();
        Group updatedGroup = groupService.updateSelective(sysId, group, updatedBy);
        GroupVO vo = groupVoFactory.getVO(updatedGroup);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/{sysId}")
    public ResponseEntity<Object> deleteRecord(@PathVariable String sysId) {
        groupService.delete(sysId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{groupId}/members")
    public ResponseEntity<Object> listGroupMembers(@PathVariable String groupId) {
        List<User> memberList = groupService.listMembers(groupId);
        List<UserVO> voList = new ArrayList<>();

        for (User member : memberList) {
            voList.add(userVoFactory.getVO(member));
        }

        return new ResponseEntity<>(voList, HttpStatus.OK);
    }

    @PutMapping("/{groupId}/members/{userId}")
    public ResponseEntity<Object> insertGroupMember(HttpServletRequest request,
                                                    @PathVariable String groupId,
                                                    @PathVariable String userId) {
        String createdBy = getSessionUser(request).getSysId();
        groupService.insertMember(groupId, userId, createdBy);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{groupId}/members/{userId}")
    public ResponseEntity<Object> removeGroupMember(@PathVariable String groupId,
                                                    @PathVariable String userId) {
        groupService.deleteMember(groupId, userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
