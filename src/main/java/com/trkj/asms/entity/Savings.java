package com.trkj.asms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (Savings)实体类
 *
 * @author makejava
 * @since 2021-07-12 02:41:58
 */
@Data
public class Savings implements Serializable {
    private static final long serialVersionUID = -90538434573027378L;
    /**
     * 储蓄余额id
     */
    private Integer savingsid;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 客户名称
     */
    private String cName;
    /**
     * 联系电话
     */
    private String cPhone;
    /**
     * 储蓄卡号
     */
    private String savingsno;
    /**
     * 剩余余额
     */
    private Double symony;
    /**
     * 创建时间
     */
    private Date cjdate;



}
