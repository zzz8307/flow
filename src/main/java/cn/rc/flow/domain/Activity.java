package cn.rc.flow.domain;

import javax.validation.constraints.NotBlank;
import java.util.Date;

import static cn.rc.flow.common.consts.ErrorMessageConsts.FIELD_IS_MANDATORY_MESSAGE;

public class Activity {
    private String sysId;

    private String taskId;

    @NotBlank(message = FIELD_IS_MANDATORY_MESSAGE)
    private String type;

    @NotBlank(message = FIELD_IS_MANDATORY_MESSAGE)
    private String detail;

    private String createdBy;

    private Date createdTime;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}