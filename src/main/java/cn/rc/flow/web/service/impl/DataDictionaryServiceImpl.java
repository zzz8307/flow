package cn.rc.flow.web.service.impl;

import cn.rc.flow.dao.DdicTypeMapper;
import cn.rc.flow.dao.DdicValueMapper;
import cn.rc.flow.domain.DdicType;
import cn.rc.flow.domain.DdicTypeExample;
import cn.rc.flow.domain.DdicValue;
import cn.rc.flow.domain.DdicValueExample;
import cn.rc.flow.web.service.DataDictionaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author rc
 */
@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

    @Resource
    private DdicTypeMapper ddicTypeMapper;
    @Resource
    private DdicValueMapper ddicValueMapper;

    @Override
    public Map<String, List<DdicValue>> getDataDictionary() {
        Map<String, List<DdicValue>> ddic = new HashMap<>();
        List<DdicType> typeList = ddicTypeMapper.selectByExample(new DdicTypeExample());

        for (DdicType type : typeList) {
            String code = type.getCode();

            DdicValueExample example = new DdicValueExample();
            example.setOrderByClause("display_order");
            example.createCriteria()
                    .andCodeEqualTo(code);

            List<DdicValue> valueList = ddicValueMapper.selectByExample(example);

            ddic.put(code, valueList);
        }

        return ddic;
    }
}
