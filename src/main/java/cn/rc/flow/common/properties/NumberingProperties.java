package cn.rc.flow.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author rc
 */
@Configuration
@PropertySource(value = "classpath:flow.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "flow.numbering")
public class NumberingProperties {

    private boolean enforceUniqueNumber = false;
    private int maxRetries = 10;

    public boolean getEnforceUniqueNumber() {
        return enforceUniqueNumber;
    }

    public void setEnforceUniqueNumber(boolean enforceUniqueNumber) {
        this.enforceUniqueNumber = enforceUniqueNumber;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }
}
