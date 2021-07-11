package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 物资采购退货出库单(WDeliveryorder)实体类
 *
 * @author makejava
 * @since 2021-07-11 10:59:30
 */
public class WDeliveryorder implements Serializable {
    private static final long serialVersionUID = -89612409945973244L;
    /**
     * 出库单ID
     */
    private Integer doId;
    /**
     * 出库单编号
     */
    private String billcode;
    /**
     * 经手人ID
     */
    private Integer pickingId;
    /**
     * 创建时间
     */
    private Date billdate;
    /**
     * 退货原因
     */
    private String backreason;
    /**
     * 供应商ID
     */
    private Integer supplerId;
    /**
     * 所属门店ID
     */
    private Integer organizeId;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 退货金额
     */
    private Double amount;


    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

    public String getBillcode() {
        return billcode;
    }

    public void setBillcode(String billcode) {
        this.billcode = billcode;
    }

    public Integer getPickingId() {
        return pickingId;
    }

    public void setPickingId(Integer pickingId) {
        this.pickingId = pickingId;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getBackreason() {
        return backreason;
    }

    public void setBackreason(String backreason) {
        this.backreason = backreason;
    }

    public Integer getSupplerId() {
        return supplerId;
    }

    public void setSupplerId(Integer supplerId) {
        this.supplerId = supplerId;
    }

    public Integer getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(Integer organizeId) {
        this.organizeId = organizeId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
