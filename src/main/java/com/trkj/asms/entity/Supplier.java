package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Supplier)实体类
 *
 * @author makejava
 * @since 2021-07-12 20:31:21
 */
public class Supplier implements Serializable {
    private static final long serialVersionUID = -46800492997878916L;
    /**
     * 供货商id
     */
    private Integer id;
    /**
     * 供货商编码
     */
    private String supplierCode;
    /**
     * 供货商名称
     */
    private String suppliername;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系电话
     */
    private String contactnumber;
    /**
     * 供货商类型id
     */
    private Integer suptypeid;
    /**
     * 所属地区
     */
    private Integer addressid;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 应付金额
     */
    private Double payablemoney;
    /**
     * 实付金额
     */
    private Double paidMoney;
    /**
     * 所属门店
     */
    private Integer sStore;
    /**
     * 初期金额
     */
    private Double money;
    /**
     * 状态 0:正常 1:禁用
     */
    private Integer statik;
    /**
     * 1:正常，0：默认客户
     */
    private Integer ismoren;
    /**
     * 联系地址
     */
    private String lxaddress;
    /**
     * 创建时间
     */
    private Date cjtime;
    /**
     * 备注
     */
    private String beizhu;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public Integer getSuptypeid() {
        return suptypeid;
    }

    public void setSuptypeid(Integer suptypeid) {
        this.suptypeid = suptypeid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Double getPayablemoney() {
        return payablemoney;
    }

    public void setPayablemoney(Double payablemoney) {
        this.payablemoney = payablemoney;
    }

    public Double getPaidMoney() {
        return paidMoney;
    }

    public void setPaidMoney(Double paidMoney) {
        this.paidMoney = paidMoney;
    }

    public Integer getSStore() {
        return sStore;
    }

    public void setSStore(Integer sStore) {
        this.sStore = sStore;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getStatik() {
        return statik;
    }

    public void setStatik(Integer statik) {
        this.statik = statik;
    }

    public Integer getIsmoren() {
        return ismoren;
    }

    public void setIsmoren(Integer ismoren) {
        this.ismoren = ismoren;
    }

    public String getLxaddress() {
        return lxaddress;
    }

    public void setLxaddress(String lxaddress) {
        this.lxaddress = lxaddress;
    }

    public Date getCjtime() {
        return cjtime;
    }

    public void setCjtime(Date cjtime) {
        this.cjtime = cjtime;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

}
