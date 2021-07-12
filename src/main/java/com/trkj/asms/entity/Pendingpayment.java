package com.trkj.asms.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * pendingpayment
 * @author 
 */
@Data
public class Pendingpayment implements Serializable {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 门店id
     */




    private Customer customer;


    private  Store store;


    private Integer sId;

    /**
     * 客户编号
     */
    private Integer customerid;

    /**
     * 采购订单编号
     */
    private String materialorderid;

    /**
     * 单据编号
     */
    private String documentnumber;

    /**
     * 单据类型
            
     */
    private String documenttype;

    /**
     * 单据状态
     */
    private Integer documentstatus;

    /**
     * 单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date documentdate;

    /**
     * 往来关系
     */
    private String relationship;

    /**
     * 本单金额
     */
    private Long orderamount;

    /**
     * 已付金额
     */
    private Long yfamount;

    /**
     * 累计免付
     */
    private Long freeamout;

    /**
     * 未付金额
     */
    private Long wfamount;

    /**
     * 经手人
     */
    private String brokerage;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deletetime;

    /**
     * 时效性（0是未过期，1是已过期）
     */
    private Integer timeliness;

    private static final long serialVersionUID = 1L;
}