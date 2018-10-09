package com.mozi.mybatis.modal;

import java.math.BigDecimal;
import java.util.Date;

public class EdsLisDetail {
    private BigDecimal lisDetailId;

    private BigDecimal lisId;

    private String itemName;

    private String itemNameEn;

    private String testResult;

    private String unit;

    private String referRange;

    private String quaResult;

    private String remark;

    private String dataStatus;

    private Date createDate;

    private String creator;

    private Date updateDate;

    private String modifyBy;

    private Date voidedDate;

    private String voidedBy;

    public BigDecimal getLisDetailId() {
        return lisDetailId;
    }

    public void setLisDetailId(BigDecimal lisDetailId) {
        this.lisDetailId = lisDetailId;
    }

    public BigDecimal getLisId() {
        return lisId;
    }

    public void setLisId(BigDecimal lisId) {
        this.lisId = lisId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemNameEn() {
        return itemNameEn;
    }

    public void setItemNameEn(String itemNameEn) {
        this.itemNameEn = itemNameEn;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getReferRange() {
        return referRange;
    }

    public void setReferRange(String referRange) {
        this.referRange = referRange;
    }

    public String getQuaResult() {
        return quaResult;
    }

    public void setQuaResult(String quaResult) {
        this.quaResult = quaResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getVoidedDate() {
        return voidedDate;
    }

    public void setVoidedDate(Date voidedDate) {
        this.voidedDate = voidedDate;
    }

    public String getVoidedBy() {
        return voidedBy;
    }

    public void setVoidedBy(String voidedBy) {
        this.voidedBy = voidedBy;
    }
}