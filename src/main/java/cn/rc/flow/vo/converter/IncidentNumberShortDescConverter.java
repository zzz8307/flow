package cn.rc.flow.vo.converter;

import cn.rc.flow.dto.NumberShortDescDTO;
import cn.rc.flow.web.service.IncidentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author rc
 */
@Component
public class IncidentNumberShortDescConverter implements DtoConverter<NumberShortDescDTO> {

    @Resource
    private IncidentService incidentService;

    @Override
    public NumberShortDescDTO convert(String sysId) {
        if (sysId == null) {
            return null;
        }

        return incidentService.getNumberShortDesc(sysId);
    }
}
