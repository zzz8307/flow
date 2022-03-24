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
public class UserVO {

    private String sysId;

    private String userName;

    private String name;

    private SysIdNameDTO manager;

    private List<SysIdNameDTO> groups;

    private String employeeNumber;

    private String email;

    private String phone;

    private String active;

    private String lockedOut;

    private SysIdNameDTO createdBy;

    private Date createdTime;

    private SysIdNameDTO updatedBy;

    private Date updatedTime;

    private Integer sysModCount;

    public String getSysId() {
        return sysId;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public SysIdNameDTO getManager() {
        return manager;
    }

    public List<SysIdNameDTO> getGroups() {
        return groups;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getActive() {
        return active;
    }

    public String getLockedOut() {
        return lockedOut;
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

    public UserVO setSysId(String sysId) {
        this.sysId = sysId == null ? "" : sysId;
        return this;
    }

    public UserVO setUserName(String userName) {
        this.userName = userName == null ? "" : userName;
        return this;
    }

    public UserVO setName(String name) {
        this.name = name == null ? "" : name;
        return this;
    }

    public UserVO setManager(SysIdNameDTO manager) {
        this.manager = manager;
        return this;
    }

    public UserVO setGroups(List<SysIdNameDTO> groups) {
        this.groups = groups == null ? Collections.emptyList() : groups;
        return this;
    }

    public UserVO setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? "" : employeeNumber;
        return this;
    }

    public UserVO setEmail(String email) {
        this.email = email == null ? "" : email;
        return this;
    }

    public UserVO setPhone(String phone) {
        this.phone = phone == null ? "" : phone;
        return this;
    }

    public UserVO setActive(String active) {
        this.active = active == null ? "" : active;
        return this;
    }

    public UserVO setLockedOut(String lockedOut) {
        this.lockedOut = lockedOut == null ? "" : lockedOut;
        return this;
    }

    public UserVO setCreatedBy(SysIdNameDTO createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UserVO setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public UserVO setUpdatedBy(SysIdNameDTO updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public UserVO setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    public UserVO setSysModCount(Integer sysModCount) {
        this.sysModCount = sysModCount;
        return this;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "sysId='" + sysId + '\'' +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", groups=" + groups +
                ", employeeNumber='" + employeeNumber + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", active='" + active + '\'' +
                ", lockedOut='" + lockedOut + '\'' +
                ", createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", sysModCount=" + sysModCount +
                '}';
    }
}
