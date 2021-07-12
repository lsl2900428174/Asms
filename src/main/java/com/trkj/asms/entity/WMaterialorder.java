package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * 物资采购订单表和库存表(WMaterialorder)实体类
 *
 * @author makejava
 * @since 2021-07-11 20:23:16
 */
public class WMaterialorder implements Serializable {
    private static final long serialVersionUID = 490759297648878408L;
    /**
     * 物资订单ID
     */
    private Integer moId;
    /**
     * 供应商
     */
    private String suppliername;
    /**
     * 创建时间
     */
    private Date billdate;
    /**
     * 采购人员
     */
    private String orderuser;
    /**
     * 预到货时间
     */
    private Date edate;
    /**
     * 采购金额
     */
    private Double amout;
    /**
     * 0:订单表1：入库表
     */
    private Integer state;
    /**
     * 订单编号
     */
    private String moNumber;
    /**
     * 采购编号
     */
    private String billcode;

    private List<WReturnedmaterials> wReturnedmaterials;


    public Integer getMoId() {
        return moId;
    }

    public void setMoId(Integer moId) {
        this.moId = moId;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getOrderuser() {
        return orderuser;
    }

    public void setOrderuser(String orderuser) {
        this.orderuser = orderuser;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public Double getAmout() {
        return amout;
    }

    public void setAmout(Double amout) {
        this.amout = amout;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    @Override
    public String toString() {
        return "WMaterialorder{" +
                "moId=" + moId +
                ", suppliername='" + suppliername + '\'' +
                ", billdate=" + billdate +
                ", orderuser='" + orderuser + '\'' +
                ", edate=" + edate +
                ", amout=" + amout +
                ", state=" + state +
                ", moNumber='" + moNumber + '\'' +
                ", billcode='" + billcode + '\'' +
                '}';
    }
}
