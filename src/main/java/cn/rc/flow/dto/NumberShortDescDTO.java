package cn.rc.flow.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author rc
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class NumberShortDescDTO {
    private String number;
    private String shortDescription;

    public String getNumber() {
        return number;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public NumberShortDescDTO setNumber(String number) {
        this.number = number;
        return this;
    }

    public NumberShortDescDTO setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    @Override
    public String toString() {
        return "NumberShortDescDTO{" +
                "number='" + number + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }
}
