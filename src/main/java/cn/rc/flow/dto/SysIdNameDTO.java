package cn.rc.flow.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author rc
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SysIdNameDTO {
    private String sysId;
    private String displayName;

    public String getSysId() {
        return sysId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public SysIdNameDTO setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }

    public SysIdNameDTO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @Override
    public String toString() {
        return "SysIdAndNameVO{" +
                "sysId='" + sysId + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
