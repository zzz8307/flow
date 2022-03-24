package cn.rc.flow.vo.converter;

import cn.rc.flow.dto.NumberShortDescDTO;
import cn.rc.flow.web.service.ProblemService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author rc
 */
@Component
public class ProblemNumberShortDescConverter implements DtoConverter<NumberShortDescDTO> {

    @Resource
    private ProblemService problemService;

    @Override
    public NumberShortDescDTO convert(String sysId) {
        if (sysId == null) {
            return null;
        }
        return problemService.getNumberShortDesc(sysId);
    }
}
