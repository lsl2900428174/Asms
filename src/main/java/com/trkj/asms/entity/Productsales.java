package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用品销售表(Productsales)实体类
 *
 * @author makejava
 * @since 2021-07-12 00:58:50
 */
public class Productsales implements Serializable {
    private static final long serialVersionUID = 752621290505050686L;
    /**
    * 用品销售单id
    */
    private Integer id;
    /**
    * 销售单编号
    */
    private String saleCode;
    /**
    * 客户id
    */
    private Integer cId;
    /**
    * 员工id
    */
    private Integer eId;
    /**
    * 销售时间
    */
    private Date saleTime;
    /**
    * 备注
    */
    private String remarks;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}