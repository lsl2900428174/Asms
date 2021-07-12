package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * (Savings)实体类
 *
 * @author makejava
 * @since 2021-07-12 02:41:58
 */
public class Savings implements Serializable {
    private static final long serialVersionUID = -90538434573027378L;
    /**
     * 储蓄余额id
     */
    private Integer savingsid;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 客户名称
     */
    private String cName;
    /**
     * 联系电话
     */
    private String cPhone;
    /**
     * 储蓄卡号
     */
    private String savingsno;
    /**
     * 剩余余额
     */
    private Double symony;


    public Integer getSavingsid() {
        return savingsid;
    }

    public void setSavingsid(Integer savingsid) {
        this.savingsid = savingsid;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCPhone() {
        return cPhone;
    }

    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public String getSavingsno() {
        return savingsno;
    }

    public void setSavingsno(String savingsno) {
        this.savingsno = savingsno;
    }

    public Double getSymony() {
        return symony;
    }

    public void setSymony(Double symony) {
        this.symony = symony;
    }

}
