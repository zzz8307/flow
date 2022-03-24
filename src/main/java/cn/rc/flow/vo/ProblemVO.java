package cn.rc.flow.vo;

import cn.rc.flow.dto.NumberShortDescDTO;
import cn.rc.flow.dto.SysIdNameDTO;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Date;

/**
 * @author rc
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ProblemVO {
    private String sysId;

    private String number;

    private NumberShortDescDTO firstReportedByTask;

    private String state;

    private String priority;

    private String category;

    private String cmdbCi;

    private SysIdNameDTO assignmentGroup;

    private SysIdNameDTO assignedTo;

    private String shortDescription;

    private String workaround;

    private String causeNotes;

    private String fixNotes;

    private SysIdNameDTO resolvedBy;

    private Date resolvedTime;

    private SysIdNameDTO createdBy;

    private Date createdTime;

    private SysIdNameDTO updatedBy;

    private Date updatedTime;

    private Integer sysModCount;

    public String getSysId() {
        return sysId;
    }

    public String getNumber() {
        return number;
    }

    public NumberShortDescDTO getFirstReportedByTask() {
        return firstReportedByTask;
    }

    public String getState() {
        return state;
    }

    public String getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    public String getCmdbCi() {
        return cmdbCi;
    }

    public SysIdNameDTO getAssignmentGroup() {
        return assignmentGroup;
    }

    public SysIdNameDTO getAssignedTo() {
        return assignedTo;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getWorkaround() {
        return workaround;
    }

    public String getCauseNotes() {
        return causeNotes;
    }

    public String getFixNotes() {
        return fixNotes;
    }

    public SysIdNameDTO getResolvedBy() {
        return resolvedBy;
    }

    public Date getResolvedTime() {
        return resolvedTime;
    }

    public SysIdNameDTO getCreatedBy() {
        return createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public SysIdNameDTO getUpdatedBy() {
        return updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public Integer getSysModCount() {
        return sysModCount;
    }

    public ProblemVO setSysId(String sysId) {
        this.sysId = sysId == null ? "" : sysId;
        return this;
    }

    public ProblemVO setNumber(String number) {
        this.number = number == null ? "" : number;
        return this;
    }

    public ProblemVO setFirstReportedByTask(NumberShortDescDTO firstReportedByTask) {
        this.firstReportedByTask = firstReportedByTask;
        return this;
    }

    public ProblemVO setState(String state) {
        this.state = state == null ? "" : state;
        return this;
    }

    public ProblemVO setPriority(String priority) {
        this.priority = priority == null ? "" : priority;
        return this;
    }

    public ProblemVO setCategory(String category) {
        this.category = category == null ? "" : category;
        return this;
    }

    public ProblemVO setCmdbCi(String cmdbCi) {
        this.cmdbCi = cmdbCi == null ? "" : cmdbCi;
        return this;
    }

    public ProblemVO setAssignmentGroup(SysIdNameDTO assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
        return this;
    }

    public ProblemVO setAssignedTo(SysIdNameDTO assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    public ProblemVO setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription == null ? "" : shortDescription;
        return this;
    }

    public ProblemVO setWorkaround(String workaround) {
        this.workaround = workaround == null ? "" : workaround;
        return this;
    }

    public ProblemVO setCauseNotes(String causeNotes) {
        this.causeNotes = causeNotes == null ? "" : causeNotes;
        return this;
    }

    public ProblemVO setFixNotes(String fixNotes) {
        this.fixNotes = fixNotes == null ? "" : fixNotes;
        return this;
    }

    public ProblemVO setResolvedBy(SysIdNameDTO resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }

    public ProblemVO setResolvedTime(Date resolvedTime) {
        this.resolvedTime = resolvedTime;
        return this;
    }

    public ProblemVO setCreatedBy(SysIdNameDTO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public ProblemVO setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public ProblemVO setUpdatedBy(SysIdNameDTO updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public ProblemVO setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public ProblemVO setSysModCount(Integer sysModCount) {
        this.sysModCount = sysModCount;
        return this;
    }

    @Override
    public String toString() {
        return "ProblemVO{" +
                "sysId='" + sysId + '\'' +
                ", number='" + number + '\'' +
                ", firstReportedByTask=" + firstReportedByTask +
                ", state='" + state + '\'' +
                ", priority='" + priority + '\'' +
                ", category='" + category + '\'' +
                ", cmdbCi='" + cmdbCi + '\'' +
                ", assignmentGroup=" + assignmentGroup +
                ", assignedTo=" + assignedTo +
                ", shortDescription='" + shortDescription + '\'' +
                ", workaround='" + workaround + '\'' +
                ", causeNotes='" + causeNotes + '\'' +
                ", fixNotes='" + fixNotes + '\'' +
                ", resolvedBy=" + resolvedBy +
                ", resolvedTime=" + resolvedTime +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", sysModCount=" + sysModCount +
                '}';
    }
}
