package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 物资商品表(Commodity)实体类
 *
 * @author makejava
 * @since 2021-07-12 09:44:36
 */
public class Commodity implements Serializable {
    private static final long serialVersionUID = 884529916337202193L;
    /**
    * 物资ID
    */
    private Integer coId;
    /**
    * 物资名称
    */
    private String coName;
    /**
    * 物资编码
    */
    private String coCode;
    /**
    * 门店id
    */
    private Integer sId;
    /**
    * 物资分类id
    */
    private Integer ciId;
    /**
    * 品牌名称id
    */
    private Integer mId;
    /**
    * 计量单位名称id
    */
    private Integer muId;
    /**
    * 物资条码
    */
    private String barcode;
    /**
    * 适用车型
    */
    private String applimodel;
    /**
    * 安装部位id
    */
    private Integer isId;
    /**
    * 规格型号
    */
    private String specialmodel;
    /**
    * 是否安装
    */
    private Integer isinstall;
    /**
    * 仓库id
    */
    private Integer wId;
    /**
    * 仓库位置id
    */
    private Integer wpId;
    /**
    * 预警
    */
    private Integer warning;
    /**
    * 零售价
    */
    private Double coRetailprice;
    /**
    * 客户领料价
    */
    private Double cusprice;


    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getCoCode() {
        return coCode;
    }

    public void setCoCode(String coCode) {
        this.coCode = coCode;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCiId() {
        return ciId;
    }

    public void setCiId(Integer ciId) {
        this.ciId = ciId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public Integer getMuId() {
        return muId;
    }

    public void setMuId(Integer muId) {
        this.muId = muId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getApplimodel() {
        return applimodel;
    }

    public void setApplimodel(String applimodel) {
        this.applimodel = applimodel;
    }

    public Integer getIsId() {
        return isId;
    }

    public void setIsId(Integer isId) {
        this.isId = isId;
    }

    public String getSpecialmodel() {
        return specialmodel;
    }

    public void setSpecialmodel(String specialmodel) {
        this.specialmodel = specialmodel;
    }

    public Integer getIsinstall() {
        return isinstall;
    }

    public void setIsinstall(Integer isinstall) {
        this.isinstall = isinstall;
    }

    public Integer getWhId() {
        return wId;
    }

    public void setWhId(Integer whId) {
        this.wId = whId;
    }

    public Integer getWpId() {
        return wpId;
    }

    public void setWpId(Integer wpId) {
        this.wpId = wpId;
    }

    public Integer getWarning() {
        return warning;
    }

    public void setWarning(Integer warning) {
        this.warning = warning;
    }

    public Double getCoRetailprice() {
        return coRetailprice;
    }

    public void setCoRetailprice(Double coRetailprice) {
        this.coRetailprice = coRetailprice;
    }

    public Double getCusprice() {
        return cusprice;
    }

    public void setCusprice(Double cusprice) {
        this.cusprice = cusprice;
    }

}