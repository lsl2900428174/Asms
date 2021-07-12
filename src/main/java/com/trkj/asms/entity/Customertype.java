package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 客户类型表(Customertype)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:00:42
 */
public class Customertype implements Serializable {
    private static final long serialVersionUID = 753398351337014321L;

    private Integer ctId;

    private String ctName;


    public Integer getCtId() {
        return ctId;
    }

    public void setCtId(Integer ctId) {
        this.ctId = ctId;
    }

    public String getCtName() {
        return ctName;
    }

    public void setCtName(String ctName) {
        this.ctName = ctName;
    }

}
