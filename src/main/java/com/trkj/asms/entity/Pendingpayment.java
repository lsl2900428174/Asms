package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 待付列表(Pendingpayment)实体类
 *
 * @author makejava
 * @since 2021-07-12 21:22:09
 */
public class Pendingpayment implements Serializable {
    private static final long serialVersionUID = -78490386804231743L;
    /**
     * 编号
     */
    private Integer id;
    /**
     * 门店id
     */
    private Store store;
    private Integer sId;
    /**
     * 客户编号
     */
    private Customer customer;
    private Integer customerid;
    /**
     * 采购订单编号
     */
    private String materialorderid;
    /**
     * 单据编号
     */
    private String documentnumber;
    /**
     * 单据类型
     */
    private String documenttype;
    /**
     * 单据状态
     */
    private Integer documentstatus;
    /**
     * 单据日期
     */
    private Date documentdate;
    /**
     * 往来关系
     */
    private String relationship;
    /**
     * 本单金额
     */
    private Double orderamount;
    /**
     * 已付金额
     */
    private Double yfamount;
    /**
     * 累计免付
     */
    private Double freeamout;
    /**
     * 未付金额
     */
    private Double wfamount;
    /**
     * 经手人
     */
    private String brokerage;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 删除时间
     */
    private Date deletetime;
    /**
     * 时效性（0是未过期，1是已过期）
     */
    private Integer timeliness;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getMaterialorderid() {
        return materialorderid;
    }

    public void setMaterialorderid(String materialorderid) {
        this.materialorderid = materialorderid;
    }

    public String getDocumentnumber() {
        return documentnumber;
    }

    public void setDocumentnumber(String documentnumber) {
        this.documentnumber = documentnumber;
    }

    public String getDocumenttype() {
        return documenttype;
    }

    public void setDocumenttype(String documenttype) {
        this.documenttype = documenttype;
    }

    public Integer getDocumentstatus() {
        return documentstatus;
    }

    public void setDocumentstatus(Integer documentstatus) {
        this.documentstatus = documentstatus;
    }

    public Date getDocumentdate() {
        return documentdate;
    }

    public void setDocumentdate(Date documentdate) {
        this.documentdate = documentdate;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Double getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(Double orderamount) {
        this.orderamount = orderamount;
    }

    public Double getYfamount() {
        return yfamount;
    }

    public void setYfamount(Double yfamount) {
        this.yfamount = yfamount;
    }

    public Double getFreeamout() {
        return freeamout;
    }

    public void setFreeamout(Double freeamout) {
        this.freeamout = freeamout;
    }

    public Double getWfamount() {
        return wfamount;
    }

    public void setWfamount(Double wfamount) {
        this.wfamount = wfamount;
    }

    public String getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(String brokerage) {
        this.brokerage = brokerage;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDeletename() {
        return deletename;
    }

    public void setDeletename(String deletename) {
        this.deletename = deletename;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

}
