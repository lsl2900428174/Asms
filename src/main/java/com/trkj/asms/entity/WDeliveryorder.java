package com.trkj.asms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * 物资采购退货出库单(WDeliveryorder)实体类
 *
 * @author makejava
 * @since 2021-07-11 10:59:30
 */
@Data
public class WDeliveryorder implements Serializable {
    private static final long serialVersionUID = -89612409945973244L;
    /**
     * 出库单ID
     */
    private Integer doId;
    /**
     * 出库单编号
     */
    private String billcode;
    /**
     * 经手人ID
     */
    private String pickingId;
    /**
     * 创建时间
     */
    private Date billdate;
    /**
     * 退货原因
     */
    private String backreason;
    /**
     * 供应商ID
     */
    private String supplerId;
    /**
     * 所属门店ID
     */
    private String organizeId;
    /**
     * 状态
     */
    private Integer state;
    /**
     * 退货金额
     */
    private Double amount;

    /**
     * 物资
     * @return
     */
    @JsonProperty(value = "wReturnedmaterials")
    private List<WReturnedmaterials> wReturnedmaterials;

}
