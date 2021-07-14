package com.trkj.asms.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Stock2)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:31:03
 */

public class Stock3 implements Serializable {
    private static final long serialVersionUID = -20477567147754624L;
    /**
     * 库存id
     */
    private Integer id;
    /**
     * 库存数量
     */
    private Integer number;
    /**
     * 所属门店
     */
    private String sName;
    /**
     * 仓库
     */
    private String storeName;
    /**
     * 物资名称
     */
    private String coName;
    /**
     * 物资编码
     */
    private String coCode;
    /**
     * 物资品牌
     */
    private String mName;
    /**
     * 物资单位
     */
    private String mdTitle;
    /**
     * 安装位置
     */
    private String isName;
    /**
     * 物资分类
     */
    private String ciName;
    /**
     * 适用车型
     */
    private String applimodel;
    /**
     * 规格型号
     */
    private String specialmodel;
    /**
     * 零售价
     */
    private Double coRetailprice;
    /**
     * 物资条码
     */
    private String barcode;
    /**
     * 领用价
     */
    private Double cusprice;

    /**
     * 库存上限
     */
    private int upx;

    /**
     * 库存下限
     */
    private int lox;

    /**
     * 预警状态
     */
    private int wstate;

    /**
     * 短缺数量
     */
    private int lo;

    /**
     * 超存数量
     */
    private int up;


    public Stock3() {
    }

    public Stock3(Integer id, Integer number, String sName, String storeName, String coName, String coCode, String mName, String mdTitle, String isName, String ciName, String applimodel, String specialmodel, Double coRetailprice, String barcode, Double cusprice, int upx, int lox) {
        this.id = id;
        this.number = number;
        this.sName = sName;
        this.storeName = storeName;
        this.coName = coName;
        this.coCode = coCode;
        this.mName = mName;
        this.mdTitle = mdTitle;
        this.isName = isName;
        this.ciName = ciName;
        this.applimodel = applimodel;
        this.specialmodel = specialmodel;
        this.coRetailprice = coRetailprice;
        this.barcode = barcode;
        this.cusprice = cusprice;
        this.upx = upx;
        this.lox = lox;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getMdTitle() {
        return mdTitle;
    }

    public void setMdTitle(String mdTitle) {
        this.mdTitle = mdTitle;
    }

    public String getIsName() {
        return isName;
    }

    public void setIsName(String isName) {
        this.isName = isName;
    }

    public String getCiName() {
        return ciName;
    }

    public void setCiName(String ciName) {
        this.ciName = ciName;
    }

    public String getApplimodel() {
        return applimodel;
    }

    public void setApplimodel(String applimodel) {
        this.applimodel = applimodel;
    }

    public String getSpecialmodel() {
        return specialmodel;
    }

    public void setSpecialmodel(String specialmodel) {
        this.specialmodel = specialmodel;
    }

    public Double getCoRetailprice() {
        return coRetailprice;
    }

    public void setCoRetailprice(Double coRetailprice) {
        this.coRetailprice = coRetailprice;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Double getCusprice() {
        return cusprice;
    }

    public void setCusprice(Double cusprice) {
        this.cusprice = cusprice;
    }

    public int getUpx() {
        return upx;
    }

    public void setUpx(int upx) {
        this.upx = upx;
    }

    public int getLox() {
        return lox;
    }

    public void setLox(int lox) {
        this.lox = lox;
    }

    public int getWstate() {
        return wstate;
    }

    public void setWstate(int wstate) {
        this.wstate = wstate;
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return "Stock3{" +
                "id=" + id +
                ", number=" + number +
                ", sName='" + sName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", coName='" + coName + '\'' +
                ", coCode='" + coCode + '\'' +
                ", mName='" + mName + '\'' +
                ", mdTitle='" + mdTitle + '\'' +
                ", isName='" + isName + '\'' +
                ", ciName='" + ciName + '\'' +
                ", applimodel='" + applimodel + '\'' +
                ", specialmodel='" + specialmodel + '\'' +
                ", coRetailprice=" + coRetailprice +
                ", barcode='" + barcode + '\'' +
                ", cusprice=" + cusprice +
                ", upx=" + upx +
                ", lox=" + lox +
                ", wstate='" + wstate + '\'' +
                ", lo=" + lo +
                ", up=" + up +
                '}';
    }
}
