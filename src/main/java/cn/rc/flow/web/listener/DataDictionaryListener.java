package cn.rc.flow.web.listener;

import cn.rc.flow.common.annotation.LogExecutionTime;
import cn.rc.flow.common.properties.RecordProperties;
import cn.rc.flow.domain.DdicValue;
import cn.rc.flow.web.service.DataDictionaryService;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;
import java.util.Map;

/**
 * @author rc
 */
@Component
@LogExecutionTime
public class DataDictionaryListener {

    private static final String TABLE_PREFIX = "t_";

    @Resource
    private ServletContext application;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private RecordProperties recordProperties;

    @EventListener(ContextRefreshedEvent.class)
    public void load() {
        Map<String, List<DdicValue>> ddic = dataDictionaryService.getDataDictionary();
        Map<String, List<DdicValue>> ddicProperties = recordProperties.getDataDictionary();

        if (ddicProperties != null) {
            ddicProperties.values().forEach(
                    valueList -> ddic.put(TABLE_PREFIX + valueList.get(0).getCode(), valueList)
            );
        }

        ddic.forEach((code, valueList) -> application.setAttribute(code, valueList));
    }
}
