package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 客户表(Customer)实体类
 *
 * @author makejava
 * @since 2021-07-11 19:58:56
 */
public class Customer implements Serializable {
    private static final long serialVersionUID = -42828052839306044L;
    /**
     * 客户 id
     */
    private Integer cId;
    /**
     * 客户名称
     */
    private String cName;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 会员价格id（折扣）
     */
    private Integer mId;
    /**
     * 性别
     */
    private String cGender;
    /**
     * 联系人
     */
    private String cContacts;
    /**
     * 电话
     */
    private String cPhone;
    /**
     * 客户类型id
     */
    private Integer ctId;
    /**
     * 地址
     */
    private String cAddress;
    /**
     * 备注
     */
    private String cText;
    /**
     * 员工id（服务顾问或者销售顾问）
     */
    private Integer eId;
    /**
     * 客户注册时间
     */
    private Date cDate;


    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getCGender() {
        return cGender;
    }

    public void setCGender(String cGender) {
        this.cGender = cGender;
    }

    public String getCContacts() {
        return cContacts;
    }

    public void setCContacts(String cContacts) {
        this.cContacts = cContacts;
    }

    public String getCPhone() {
        return cPhone;
    }

    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public String getCAddress() {
        return cAddress;
    }

    public void setCAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getCText() {
        return cText;
    }

    public void setCText(String cText) {
        this.cText = cText;
    }

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public Date getCDate() {
        return cDate;
    }

    public void setCDate(Date cDate) {
        this.cDate = cDate;
    }

}
