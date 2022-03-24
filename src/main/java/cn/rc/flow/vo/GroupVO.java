package cn.rc.flow.vo;

import cn.rc.flow.dto.SysIdNameDTO;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author rc
 */
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GroupVO {

    private String sysId;

    private String name;

    private String groupEmail;

    private SysIdNameDTO manager;

    private List<SysIdNameDTO> members;

    private String description;

    private SysIdNameDTO createdBy;

    private Date createdTime;

    private SysIdNameDTO updatedBy;

    private Date updatedTime;

    private Integer sysModCount;

    public String getSysId() {
        return sysId;
    }

    public String getName() {
        return name;
    }

    public String getGroupEmail() {
        return groupEmail;
    }

    public SysIdNameDTO getManager() {
        return manager;
    }

    public List<SysIdNameDTO> getMembers() {
        return members;
    }

    public String getDescription() {
        return description;
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

    public GroupVO setSysId(String sysId) {
        this.sysId = sysId == null ? "" : sysId;
        return this;
    }

    public GroupVO setName(String name) {
        this.name = name == null ? "" : name;
        return this;
    }

    public GroupVO setGroupEmail(String groupEmail) {
        this.groupEmail = groupEmail == null ? "" : groupEmail;
        return this;
    }

    public GroupVO setManager(SysIdNameDTO manager) {
        this.manager = manager;
        return this;
    }

    public GroupVO setMembers(List<SysIdNameDTO> members) {
        this.members = members == null ? Collections.emptyList() : members;
        return this;
    }

    public GroupVO setDescription(String description) {
        this.description = description == null ? "" : description;
        return this;
    }

    public GroupVO setCreatedBy(SysIdNameDTO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public GroupVO setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public GroupVO setUpdatedBy(SysIdNameDTO updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public GroupVO setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public GroupVO setSysModCount(Integer sysModCount) {
        this.sysModCount = sysModCount;
        return this;
    }

    @Override
    public String toString() {
        return "GroupVO{" +
                "sysId='" + sysId + '\'' +
                ", name='" + name + '\'' +
                ", groupEmail='" + groupEmail + '\'' +
                ", manager=" + manager +
                ", members=" + members +
                ", description='" + description + '\'' +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", sysModCount=" + sysModCount +
                '}';
    }
}
