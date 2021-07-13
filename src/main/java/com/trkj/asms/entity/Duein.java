package com.trkj.asms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * duein
 * @author 
 */
@Data
public class Duein implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 门店id
     */
    private Store store;
    private Integer sId;

    /**
     * 单据编号
     */
    private String documentnumber;

    /**
     * 单据类型
     */
    private String documenttype;

    /**
     * 单据状态：已登记或已结算
     */
    private Integer documentstatus;

    /**
     * 单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date documentdate;

    /**
     * 往来关系
     */
    private String relationship;

    /**
     * 往来客户编号
     */
    private Customer customer;
    private Integer customerid;

    /**
     * 车牌管理编号
     */
    private Carmanagement carmanagement;
    private String carmagid;

    /**
     * 本单金额
     */
    private BigDecimal orderamount;

    /**
     * 经办人（付款的当前用户）
     */
    private String operator;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 删除人
     */
    private String deletename;

    /**
     * 删除时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deletetime;

    /**
     * 时效性(0未过期，已过期)
     */
    private Integer timeliness;

    /**
     * 洗车开单编号
     */
    private Integer carid;

    /**
     * 物资退款编号（退货物资：物资编码）
     */
    private Integer materialcodeid;

    /**
     * 维修开单编号
     */
    private Integer mainbillingid;

    private static final long serialVersionUID = 1L;
}