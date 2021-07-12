package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 车身颜色表(Color)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:41:11
 */
public class Color implements Serializable {
    private static final long serialVersionUID = -61537261628781545L;
    /**
     * 车身颜色id
     */
    private Integer bcId;
    /**
     * 颜色名称
     */
    private String bcName;
    /**
     * 状态
     */
    private String bcState;


    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public String getBcName() {
        return bcName;
    }

    public void setBcName(String bcName) {
        this.bcName = bcName;
    }

    public String getBcState() {
        return bcState;
    }

    public void setBcState(String bcState) {
        this.bcState = bcState;
    }

}
