package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 车辆类型表(Vehicletype)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:40:06
 */
public class Vehicletype implements Serializable {
    private static final long serialVersionUID = -59409159145613379L;
    /**
     * 车辆类型id
     */
    private Integer vId;
    /**
     * 车辆类型名称
     */
    private String vName;


    public Integer getVId() {
        return vId;
    }

    public void setVId(Integer vId) {
        this.vId = vId;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

}
