package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 物资品牌表(Materialbrand)实体类
 *
 * @author makejava
 * @since 2021-07-12 20:02:06
 */
public class Materialbrand implements Serializable {
    private static final long serialVersionUID = 488452818155520773L;
    /**
     * 物资品牌ID
     */
    private Integer mId;
    /**
     * 物资品牌名称
     */
    private String mName;
    /**
     * 状态
     */
    private Integer mState;


    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public Integer getMState() {
        return mState;
    }

    public void setMState(Integer mState) {
        this.mState = mState;
    }

}
