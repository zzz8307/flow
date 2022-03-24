package cn.rc.flow.web.service;

import cn.rc.flow.domain.DdicValue;

import java.util.List;
import java.util.Map;

/**
 * @author rc
 */
public interface DataDictionaryService {
    /**
     * Get data dictionary from database
     * @return key: t_ddic_type.code，value: t_ddiv_value
     */
    Map<String, List<DdicValue>> getDataDictionary();
}
