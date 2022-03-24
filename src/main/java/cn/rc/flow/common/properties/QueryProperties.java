package cn.rc.flow.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author rc
 */
@Configuration
@PropertySource(value = "classpath:flow.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "flow.query")
public class QueryProperties {

    private boolean ignoreInvalidField = true;

    public boolean isIgnoreInvalidField() {
        return ignoreInvalidField;
    }

    public void setIgnoreInvalidField(boolean ignoreInvalidField) {
        this.ignoreInvalidField = ignoreInvalidField;
    }
}
