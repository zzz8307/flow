package cn.rc.flow.vo.converter;

import cn.rc.flow.dto.SysIdNameDTO;
import cn.rc.flow.web.service.GroupService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author rc
 */
@Component
public class GroupSysIdNameConverter implements DtoConverter<SysIdNameDTO> {
    @Resource
    private GroupService groupService;

    @Override
    public SysIdNameDTO convert(String sysId) {
        if (sysId == null) {
            return null;
        }
        return groupService.getSysIdAndName(sysId);
    }

    public List<SysIdNameDTO> convertGroups(String userSysId) {
        if (userSysId == null) {
            return Collections.emptyList();
        }
        return groupService.getGroupsSysIdAndNameList(userSysId);
    }
}
