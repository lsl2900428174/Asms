package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 车辆车系表(Series)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:39:27
 */
public class Series implements Serializable {
    private static final long serialVersionUID = -76398577944955196L;
    /**
     * 车系id
     */
    private Integer vsId;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 品牌名称
     */
    private String bName;
    /**
     * 车系名称
     */
    private String vsName;
    /**
     * 车辆类型
     */
    private String vName;
    /**
     * 状态
     */
    private Integer vsState;


    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
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

    public String getVsName() {
        return vsName;
    }

    public void setVsName(String vsName) {
        this.vsName = vsName;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public Integer getVsState() {
        return vsState;
    }

    public void setVsState(Integer vsState) {
        this.vsState = vsState;
    }

}
