package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 车辆品牌表(Brand)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:38:29
 */
public class Brand implements Serializable {
    private static final long serialVersionUID = -57669961018572570L;
    /**
     * 车辆品牌id
     */
    private Integer bId;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 品牌名称
     */
    private String bName;
    /**
     * 状态
     */
    private Integer bState;


    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getBName() {
        return bName;
    }

    public void setBName(String bName) {
        this.bName = bName;
    }

    public Integer getBState() {
        return bState;
    }

    public void setBState(Integer bState) {
        this.bState = bState;
    }

}
