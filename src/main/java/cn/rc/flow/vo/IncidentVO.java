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
public class IncidentVO {

    private String sysId;

    private String number;

    private SysIdNameDTO caller;

    private SysIdNameDTO openedFor;

    private String contactType;

    private String state;

    private String priority;

    private String category;

    private String symptom;

    private String cmdbCi;

    private String holdReason;

    private Date pendingTime;

    private SysIdNameDTO ownershipGroup;

    private SysIdNameDTO assignmentGroup;

    private SysIdNameDTO assignedTo;

    private String correlationId;

    private String shortDescription;

    private String description;

    private NumberShortDescDTO problem;

    private String closeCode;

    private String closeNotes;

    private String causeCode;

    private SysIdNameDTO closedBy;

    private Date closedTime;

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

    public SysIdNameDTO getCaller() {
        return caller;
    }

    public SysIdNameDTO getOpenedFor() {
        return openedFor;
    }

    public String getContactType() {
        return contactType;
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

    public String getSymptom() {
        return symptom;
    }

    public String getCmdbCi() {
        return cmdbCi;
    }

    public String getHoldReason() {
        return holdReason;
    }

    public Date getPendingTime() {
        return pendingTime;
    }

    public SysIdNameDTO getOwnershipGroup() {
        return ownershipGroup;
    }

    public SysIdNameDTO getAssignmentGroup() {
        return assignmentGroup;
    }

    public SysIdNameDTO getAssignedTo() {
        return assignedTo;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public NumberShortDescDTO getProblem() {
        return problem;
    }

    public String getCloseCode() {
        return closeCode;
    }

    public String getCloseNotes() {
        return closeNotes;
    }

    public String getCauseCode() {
        return causeCode;
    }

    public SysIdNameDTO getClosedBy() {
        return closedBy;
    }

    public Date getClosedTime() {
        return closedTime;
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

    public IncidentVO setSysId(String sysId) {
        this.sysId = sysId == null ? "" : sysId;
        return this;
    }

    public IncidentVO setNumber(String number) {
        this.number = number == null ? "" : number;
        return this;
    }

    public IncidentVO setCaller(SysIdNameDTO caller) {
        this.caller = caller;
        return this;
    }

    public IncidentVO setOpenedFor(SysIdNameDTO openedFor) {
        this.openedFor = openedFor;
        return this;
    }

    public IncidentVO setContactType(String contactType) {
        this.contactType = contactType == null ? "" : contactType;
        return this;
    }

    public IncidentVO setState(String state) {
        this.state = state == null ? "" : state;
        return this;
    }

    public IncidentVO setPriority(String priority) {
        this.priority = priority == null ? "" : priority;
        return this;
    }

    public IncidentVO setCategory(String category) {
        this.category = category == null ? "" : category;
        return this;
    }

    public IncidentVO setSymptom(String symptom) {
        this.symptom = symptom == null ? "" : symptom;
        return this;
    }

    public IncidentVO setCmdbCi(String cmdbCi) {
        this.cmdbCi = cmdbCi == null ? "" : cmdbCi;
        return this;
    }

    public IncidentVO setHoldReason(String holdReason) {
        this.holdReason = holdReason == null ? "" : holdReason;
        return this;
    }

    public IncidentVO setPendingTime(Date pendingTime) {
        this.pendingTime = pendingTime;
        return this;
    }

    public IncidentVO setOwnershipGroup(SysIdNameDTO ownershipGroup) {
        this.ownershipGroup = ownershipGroup;
        return this;
    }

    public IncidentVO setAssignmentGroup(SysIdNameDTO assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
        return this;
    }

    public IncidentVO setAssignedTo(SysIdNameDTO assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    public IncidentVO setCorrelationId(String correlationId) {
        this.correlationId = correlationId == null ? "" : correlationId;
        return this;
    }

    public IncidentVO setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription == null ? "" : shortDescription;
        return this;
    }

    public IncidentVO setDescription(String description) {
        this.description = description == null ? "" : description;
        return this;
    }

    public IncidentVO setProblem(NumberShortDescDTO problem) {
        this.problem = problem;
        return this;
    }

    public IncidentVO setCloseCode(String closeCode) {
        this.closeCode = closeCode == null ? "" : closeCode;
        return this;
    }

    public IncidentVO setCloseNotes(String closeNotes) {
        this.closeNotes = closeNotes == null ? "" : closeNotes;
        return this;
    }

    public IncidentVO setCauseCode(String causeCode) {
        this.causeCode = causeCode == null ? "" : causeCode;
        return this;
    }

    public IncidentVO setClosedBy(SysIdNameDTO closedBy) {
        this.closedBy = closedBy;
        return this;
    }

    public IncidentVO setClosedTime(Date closedTime) {
        this.closedTime = closedTime;
        return this;
    }

    public IncidentVO setCreatedBy(SysIdNameDTO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public IncidentVO setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public IncidentVO setUpdatedBy(SysIdNameDTO updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public IncidentVO setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public IncidentVO setSysModCount(Integer sysModCount) {
        this.sysModCount = sysModCount;
        return this;
    }

    @Override
    public String toString() {
        return "IncidentVo{" +
                "sysId='" + sysId + '\'' +
                ", number='" + number + '\'' +
                ", caller=" + caller +
                ", openedFor=" + openedFor +
                ", contactType='" + contactType + '\'' +
                ", state='" + state + '\'' +
                ", priority='" + priority + '\'' +
                ", category='" + category + '\'' +
                ", symptom='" + symptom + '\'' +
                ", cmdbCi='" + cmdbCi + '\'' +
                ", holdReason='" + holdReason + '\'' +
                ", pendingTime=" + pendingTime +
                ", ownershipGroup=" + ownershipGroup +
                ", assignmentGroup=" + assignmentGroup +
                ", assignedTo=" + assignedTo +
                ", correlationId='" + correlationId + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", problem='" + problem + '\'' +
                ", closeCode='" + closeCode + '\'' +
                ", closeNotes='" + closeNotes + '\'' +
                ", causeCode='" + causeCode + '\'' +
                ", closedBy=" + closedBy +
                ", closedTime=" + closedTime +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", sysModCount=" + sysModCount +
                '}';
    }
}
