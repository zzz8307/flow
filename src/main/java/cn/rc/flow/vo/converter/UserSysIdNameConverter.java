package cn.rc.flow.vo.converter;

import cn.rc.flow.dto.SysIdNameDTO;
import cn.rc.flow.web.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author rc
 */
@Component
public class UserSysIdNameConverter implements DtoConverter<SysIdNameDTO> {
    @Resource
    private UserService userService;

    @Override
    public SysIdNameDTO convert(String sysId) {
        if (sysId == null) {
            return null;
        }
        return userService.getSysIdAndName(sysId);
    }

    public List<SysIdNameDTO> convertMembers(String groupSysId) {
        if (groupSysId == null) {
            return Collections.emptyList();
        }
        return userService.getMembersSysIdAndNameList(groupSysId);
    }
}
