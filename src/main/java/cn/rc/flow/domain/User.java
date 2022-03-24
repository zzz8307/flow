package cn.rc.flow.domain;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

import static cn.rc.flow.common.consts.ErrorMessageConsts.FIELD_IS_MANDATORY_MESSAGE;

public class User implements Serializable {
    private String sysId;

    @NotBlank(message = FIELD_IS_MANDATORY_MESSAGE)
    private String userName;

    @NotBlank(message = FIELD_IS_MANDATORY_MESSAGE)
    private String userPassword;

    @NotBlank(message = FIELD_IS_MANDATORY_MESSAGE)
    private String name;

    private String managerId;

    private String employeeNumber;

    private String email;

    private String phone;

    private String active;

    private String lockedOut;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getLockedOut() {
        return lockedOut;
    }

    public void setLockedOut(String lockedOut) {
        this.lockedOut = lockedOut;
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