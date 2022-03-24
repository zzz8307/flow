package cn.rc.flow.vo.converter;

import cn.rc.flow.domain.DdicValue;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

import static cn.rc.flow.common.consts.RecordValueConsts.EMPTY_DISPLAY_VALUE;
import static cn.rc.flow.common.consts.RecordValueConsts.NULL_DISPLAY_VALUE;

/**
 * @author rc
 */
@Component
public class DdicDisplayValueConverter {

    @Resource
    private ServletContext application;

    public String convert(String code, String value) {
        if (value == null) {
            return NULL_DISPLAY_VALUE;
        }
        if (value.isBlank()) {
            return EMPTY_DISPLAY_VALUE;
        }

        List<DdicValue> valueList = (List<DdicValue>) application.getAttribute(code);
        for (DdicValue ddicValue : valueList) {
            if (ddicValue.getValue().equals(value)) {
                return ddicValue.getText();
            }
        }
        return String.format("(%s)", value);
    }
}
