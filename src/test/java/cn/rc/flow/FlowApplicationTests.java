package cn.rc.flow;

import cn.rc.flow.common.properties.QueryProperties;
import cn.rc.flow.common.properties.RecordProperties;
import cn.rc.flow.common.utils.Query;
import cn.rc.flow.common.utils.QueryParser;
import cn.rc.flow.common.utils.UUIDUtil;
import cn.rc.flow.domain.DdicValue;
import cn.rc.flow.domain.Incident;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StopWatch;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class FlowApplicationTests {

    @Resource
    private RecordProperties recordProperties;
    @Resource
    private QueryProperties queryProperties;

    @Resource
    private ServletContext application;

    @Test
    void generateUUID() {
        System.out.println(UUIDUtil.getUUID());
    }

    @Test
    void yamlPropertiesInjectTest() {
        assertEquals(5, recordProperties.getMaxUpdateRetries());
    }

    @Test
    void dataDictionaryPropertiesInjectTest() {
        assertNotNull(recordProperties.getDataDictionary());
    }

    @Test
    void dataDictionaryServletContextLoadTest() {
        assertNotNull(application.getAttribute("activity_type"));
    }

    @Test
    void dataDictionaryPropertiesServletContextLoadTest() {
        List<DdicValue> activityType = (List<DdicValue>) application.getAttribute("activity_type");
        assertNotNull(application.getAttribute("test_type"));
        assertEquals("overwrite_test", activityType.get(0).getValue());
    }

    @Test
    void queryConditionTest() {
        String query = "caller_id=d2826bf03710200044e0bfc8bcbe5dc9^active=true^ORstate=1^descriptionLIKEabc^ORshort_descriptionLIKEcba^ORactive=1^numberSTARTSWITHINC^ORDERBYDESCnumber^ORDERBYcategory";
        StopWatch watch = new StopWatch();
        watch.start();

        QueryParser queryParser = new QueryParser(Incident.class, queryProperties.isIgnoreInvalidField());
        Query conditions = queryParser.parse(query);

        watch.stop();
        System.out.println(watch.getTotalTimeMillis() + "ms");
    }
}
