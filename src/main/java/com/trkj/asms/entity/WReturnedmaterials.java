package com.trkj.asms.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 退货物资(WReturnedmaterials)实体类
 *
 * @author makejava
 * @since 2021-07-12 09:00:26
 */
@Data
public class WReturnedmaterials implements Serializable {
    private static final long serialVersionUID = -20599084265383523L;
    /**
     * 退货ID
     */
    private Integer rId;
    /**
     * 物资编码
     */
    private String materialcode;
    /**
     * 物资名称
     */
    private String materialname;
    /**
     * 物资分类
     */
    private String typename;
    /**
     * 物资品牌
     */
    private String brand;
    /**
     * 适用车型
     */
    private String modelname;
    /**
     * 安装部位
     */
    private String sitepartname;
    /**
     * 物资单位
     */
    private String unitname;
    /**
     * 库存数量
     */
    private Integer number;
    /**
     * 退货数量
     */
    private Integer backnumber;
    /**
     * 退货单价
     */
    private Double unitprice;
    /**
     * 退货金额
     */
    private Double amountprice;
    /**
     * 仓库
     */
    private String storename;
    /**
     * 出库单编号;订单编号；领料出库单编号
     */
    private String billcode;


    public Integer getRId() {
        return rId;
    }


}
