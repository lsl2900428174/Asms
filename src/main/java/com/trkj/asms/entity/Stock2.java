package com.trkj.asms.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Stock2)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:31:03
 */
@Data
public class Stock2 implements Serializable {
    private static final long serialVersionUID = -20477567147754624L;
    /**
     * 库存id
     */
    private Integer id;
    /**
     * 物资名称
     */
    private String coName;
    /**
     * 物资编码
     */
    private String coCode;
    /**
     * 物资品牌
     */
    private String mName;
    /**
     * 物资单位
     */
    private String mdTitle;
    /**
     * 安装位置
     */
    private String isName;
    /**
     * 物资分类
     */
    private String ciName;
    /**
     * 零售价
     */
    private Double coRetailprice;
    /**
     * 领用价
     */
    private Double cusprice;
    /**
     * 库存数量
     */
    private Integer number;

}
