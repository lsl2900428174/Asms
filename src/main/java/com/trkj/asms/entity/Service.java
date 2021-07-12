package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 维修类型表(Service)实体类
 *
 * @author makejava
 * @since 2021-07-12 09:28:34
 */
public class Service implements Serializable {
    private static final long serialVersionUID = -25618478123990398L;
    /**
    * 维修类型id
    */
    private Integer serviceid;
    /**
    * 类型名称
    */
    private String servicename;
    /**
    * 状态
    */
    private Integer state;


    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}