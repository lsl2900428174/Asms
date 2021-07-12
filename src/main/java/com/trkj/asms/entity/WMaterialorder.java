package com.trkj.asms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * 物资采购订单表和库存表(WMaterialorder)实体类
 *
 * @author makejava
 * @since 2021-07-11 20:23:16
 */
@Data
public class WMaterialorder implements Serializable {
    private static final long serialVersionUID = 490759297648878408L;
    /**
     * 物资订单ID
     */
    private Integer moId;
    /**
     * 供应商
     */
    private String suppliername;
    /**
     * 创建时间
     */
    private Date billdate;
    /**
     * 采购人员
     */
    private String orderuser;
    /**
     * 预到货时间
     */
    private Date edate;
    /**
     * 采购金额
     */
    private Double amout;
    /**
     * 0:订单表1：入库表
     */
    private Integer state;
    /**
     * 订单编号
     */
    private String moNumber;
    /**
     * 采购编号
     */
    private String billcode;

    /**
     * 物资
     * @return
     */
    @JsonProperty(value = "wReturnedmaterials")
    private List<WReturnedmaterials> wReturnedmaterials;

}
