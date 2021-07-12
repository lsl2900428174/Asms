package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 内饰颜色表(Interiorcolor)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:40:40
 */
public class Interiorcolor implements Serializable {
    private static final long serialVersionUID = -64901996906450888L;
    /**
     * 内饰颜色id
     */
    private Integer iId;
    /**
     * 内饰颜色名称
     */
    private String iName;
    /**
     * 状态
     */
    private Integer iState;


    public Integer getIId() {
        return iId;
    }

    public void setIId(Integer iId) {
        this.iId = iId;
    }

    public String getIName() {
        return iName;
    }

    public void setIName(String iName) {
        this.iName = iName;
    }

    public Integer getIState() {
        return iState;
    }

    public void setIState(Integer iState) {
        this.iState = iState;
    }

}
