package cn.rc.flow.common.properties;

import cn.rc.flow.domain.DdicValue;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author rc
 */
@Configuration
@PropertySource(value = "classpath:flow.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "flow.record")
public class RecordProperties {

    private int maxUpdateRetries = 10;
    private Map<String, List<DdicValue>> dataDictionary;

    public int getMaxUpdateRetries() {
        return maxUpdateRetries;
    }

    public void setMaxUpdateRetries(int maxUpdateRetries) {
        this.maxUpdateRetries = maxUpdateRetries;
    }

    public Map<String, List<DdicValue>> getDataDictionary() {
        return dataDictionary;
    }

    public void setDataDictionary(Map<String, List<DdicValue>> dataDictionary) {
        this.dataDictionary = dataDictionary;
    }
}
