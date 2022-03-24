package cn.rc.flow.web.controller;

import cn.rc.flow.common.annotation.LogExecutionTime;
import cn.rc.flow.common.annotation.apiCallHistoryLogger;
import cn.rc.flow.domain.Group;
import cn.rc.flow.domain.User;
import cn.rc.flow.vo.GroupVO;
import cn.rc.flow.vo.UserVO;
import cn.rc.flow.vo.factory.GroupVoFactory;
import cn.rc.flow.vo.factory.UserVoFactory;
import cn.rc.flow.web.service.UserService;
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
public class UserController extends AbstractFlowController implements BaseController<User> {
    @Resource
    private UserService userService;

    @Resource
    private UserVoFactory userVoFactory;
    @Resource
    private GroupVoFactory groupVoFactory;

    @GetMapping("/current")
    public ResponseEntity<Object> getCurrentUser(HttpServletRequest request,
                                                 @RequestParam(required = false) Boolean displayValue) {
        User currentUser = getSessionUser(request);

        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(userVoFactory.getVO(currentUser), HttpStatus.OK)
                : new ResponseEntity<>(currentUser, HttpStatus.OK);
    }

    @PatchMapping("/current")
    public ResponseEntity<Object> updateCurrentUserSelective(HttpServletRequest request,
                                                             User user,
                                                             @RequestParam(required = false) Boolean displayValue) {
        String userSysId = getSessionUser(request).getSysId();
        User updatedUser = userService.updateSelective(userSysId, user, userSysId);
        return Boolean.TRUE.equals(displayValue)
                ? new ResponseEntity<>(userVoFactory.getVO(updatedUser), HttpStatus.OK)
                : new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @Override
    @GetMapping("/users")
    public ResponseEntity<Object> listRecords(@RequestParam(value = "query", required = false) String query,
                                              @RequestParam(value = "offset", required = false) Integer ofs,
                                              @RequestParam(value = "limit", required = false) Integer lim,
                                              @RequestParam(required = false) Boolean displayValue) {
        int offset = ofs == null ? 0 : ofs;
        int limit = lim == null ? 100 : lim;

        List<User> list = (query == null || query.isBlank())
                ? userService.listAll(offset, limit)
                : userService.listByCondition(query, offset, limit);

        if (Boolean.TRUE.equals(displayValue)) {
            List<UserVO> voList = new ArrayList<>();
            list.forEach(user -> voList.add(userVoFactory.getVO(user)));
            return new ResponseEntity<>(voList, HttpStatus.OK);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @Override
    @GetMapping("/users/{sysId}")
    public ResponseEntity<Object> getRecord(@PathVariable String sysId,
                                            @RequestParam(required = false) Boolean displayValue) {
        User user = userService.get(sysId);
        UserVO vo = userVoFactory.getVO(user);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    @Override
    @PostMapping("/users")
    public ResponseEntity<Object> insertRecord(HttpServletRequest request,
                                               @Valid User user,
                                               @RequestParam(required = false) Boolean displayValue) {
        String createdBy = getSessionUser(request).getSysId();
        User insertedUser = userService.insert(user, createdBy);
        UserVO vo = userVoFactory.getVO(insertedUser);
        return new ResponseEntity<>(vo, HttpStatus.CREATED);
    }

    @Override
    @PatchMapping("/users/{sysId}")
    public ResponseEntity<Object> updateRecord(HttpServletRequest request,
                                               @PathVariable String sysId,
                                               User user,
                                               @RequestParam(required = false) Boolean displayValue) {
        String updatedBy = getSessionUser(request).getSysId();
        User updatedUser = userService.updateSelective(sysId, user, updatedBy);
        UserVO vo = userVoFactory.getVO(updatedUser);
        return new ResponseEntity<>(vo, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/users/{sysId}")
    public ResponseEntity<Object> deleteRecord(@PathVariable String sysId) {
        userService.delete(sysId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/users/{sysId}/groups")
    public ResponseEntity<Object> listUserGroups(@PathVariable String sysId) {
        List<Group> groupList = userService.listUserGroups(sysId);
        List<GroupVO> voList = new ArrayList<>();

        for (Group group : groupList) {
            voList.add(groupVoFactory.getVO(group));
        }

        return new ResponseEntity<>(voList, HttpStatus.OK);
    }
}
