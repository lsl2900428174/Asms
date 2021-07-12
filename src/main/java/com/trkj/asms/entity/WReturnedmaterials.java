package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 退货物资(WReturnedmaterials)实体类
 *
 * @author makejava
 * @since 2021-07-12 09:00:26
 */
public class WReturnedmaterials implements Serializable {
    private static final long serialVersionUID = -20599084265383523L;
    /**
     * 退货ID
     */
    private Integer rId;
    /**
     * 物资编码
     */
    private String materialcode;
    /**
     * 物资名称
     */
    private String materialname;
    /**
     * 物资分类
     */
    private String typename;
    /**
     * 物资品牌
     */
    private String brand;
    /**
     * 适用车型
     */
    private String modelname;
    /**
     * 安装部位
     */
    private String sitepartname;
    /**
     * 物资单位
     */
    private String unitname;
    /**
     * 库存数量
     */
    private Integer number;
    /**
     * 退货数量
     */
    private Integer backnumber;
    /**
     * 退货单价
     */
    private Double unitprice;
    /**
     * 退货金额
     */
    private Double amountprice;
    /**
     * 仓库
     */
    private String storename;
    /**
     * 出库单编号;订单编号；领料出库单编号
     */
    private String billcode;


    public Integer getRId() {
        return rId;
    }

    public void setRId(Integer rId) {
        this.rId = rId;
    }

    public String getMaterialcode() {
        return materialcode;
    }

    public void setMaterialcode(String materialcode) {
        this.materialcode = materialcode;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getSitepartname() {
        return sitepartname;
    }

    public void setSitepartname(String sitepartname) {
        this.sitepartname = sitepartname;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getBacknumber() {
        return backnumber;
    }

    public void setBacknumber(Integer backnumber) {
        this.backnumber = backnumber;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Double getAmountprice() {
        return amountprice;
    }

    public void setAmountprice(Double amountprice) {
        this.amountprice = amountprice;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

}
