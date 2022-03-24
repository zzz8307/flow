package cn.rc.flow.domain;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.validation.constraints.NotBlank;
import java.util.Date;

import static cn.rc.flow.common.consts.ErrorMessageConsts.FIELD_IS_MANDATORY_MESSAGE;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Problem {
    private String sysId;

    private String number;

    private String firstReportedByTask;

    private Integer state;

    private Integer priority;

    private String category;

    private String cmdbCi;

    private String assignmentGroup;

    private String assignedTo;

    @NotBlank(message = FIELD_IS_MANDATORY_MESSAGE)
    private String shortDescription;

    private String workaround;

    private String causeNotes;

    private String fixNotes;

    private String resolvedBy;

    private Date resolvedTime;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private Integer sysModCount;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstReportedByTask() {
        return firstReportedByTask;
    }

    public void setFirstReportedByTask(String firstReportedByTask) {
        this.firstReportedByTask = firstReportedByTask;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCmdbCi() {
        return cmdbCi;
    }

    public void setCmdbCi(String cmdbCi) {
        this.cmdbCi = cmdbCi;
    }

    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    public void setAssignmentGroup(String assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getWorkaround() {
        return workaround;
    }

    public void setWorkaround(String workaround) {
        this.workaround = workaround;
    }

    public String getCauseNotes() {
        return causeNotes;
    }

    public void setCauseNotes(String causeNotes) {
        this.causeNotes = causeNotes;
    }

    public String getFixNotes() {
        return fixNotes;
    }

    public void setFixNotes(String fixNotes) {
        this.fixNotes = fixNotes;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public Date getResolvedTime() {
        return resolvedTime;
    }

    public void setResolvedTime(Date resolvedTime) {
        this.resolvedTime = resolvedTime;
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

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getSysModCount() {
        return sysModCount;
    }

    public void setSysModCount(Integer sysModCount) {
        this.sysModCount = sysModCount;
    }
}