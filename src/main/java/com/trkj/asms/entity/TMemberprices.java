package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * (TMemberprices)实体类
 *
 * @author makejava
 * @since 2021-07-12 11:02:25
 */
public class TMemberprices implements Serializable {
    private static final long serialVersionUID = -10051470367768962L;
    /**
     * 会员价格id
     */
    private Integer mId;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 客户id
     */
    private Integer cId;
    /**
     * 折扣
     */
    private Double zheko;


    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public Double getZheko() {
        return zheko;
    }

    public void setZheko(Double zheko) {
        this.zheko = zheko;
    }

}
