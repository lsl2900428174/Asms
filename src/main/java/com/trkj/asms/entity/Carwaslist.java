package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Carwaslist)实体类
 *
 * @author makejava
 * @since 2021-07-11 10:55:48
 */
public class Carwaslist implements Serializable {
    private static final long serialVersionUID = 377246538456668572L;
    /**
     * 编号
     */
    private Integer carid;
    /**
     * 所属门店id
     */
    private Integer sId;
    /**
     * 单据编号
     */
    private String documentnumber;
    /**
     * 单据日期
     */
    private Date documentdate;
    /**
     * 单据状态(0表示已登录，1表示已付款)
     */
    private Integer documentstatus;
    /**
     * 车辆id
     */
    private Integer carmagid;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 应收金额
     */
    private Double amountreceivable;
    /**
     * 派工状态
     */
    private String deliverystatus;
    /**
     * 完工状态
     */
    private String completionstatus;
    /**
     * 服务顾问编号
     */
    private Integer eId;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 项目编号
     */
    private Integer pId;


    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getDocumentnumber() {
        return documentnumber;
    }

    public void setDocumentnumber(String documentnumber) {
        this.documentnumber = documentnumber;
    }

    public Date getDocumentdate() {
        return documentdate;
    }

    public void setDocumentdate(Date documentdate) {
        this.documentdate = documentdate;
    }

    public Integer getDocumentstatus() {
        return documentstatus;
    }

    public void setDocumentstatus(Integer documentstatus) {
        this.documentstatus = documentstatus;
    }

    public Integer getCarmagid() {
        return carmagid;
    }

    public void setCarmagid(Integer carmagid) {
        this.carmagid = carmagid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getAmountreceivable() {
        return amountreceivable;
    }

    public void setAmountreceivable(Double amountreceivable) {
        this.amountreceivable = amountreceivable;
    }

    public String getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(String deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public String getCompletionstatus() {
        return completionstatus;
    }

    public void setCompletionstatus(String completionstatus) {
        this.completionstatus = completionstatus;
    }

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

}
