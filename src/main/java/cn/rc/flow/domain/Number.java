package cn.rc.flow.domain;

import java.util.Date;

public class Number {
    private String sysId;

    private String tableName;

    private String prefix;

    private Integer maximumDigits;

    private Integer number;

    private Date createdTime;

    private Date updatedTime;

    private Integer sysModCount;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getMaximumDigits() {
        return maximumDigits;
    }

    public void setMaximumDigits(Integer maximumDigits) {
        this.maximumDigits = maximumDigits;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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