package com.trkj.asms.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * refundorder
 * @author 
 */
@Data
public class Refundorder implements Serializable {
    /**
     * 编号
     */
    private Integer rId;

    /**
     * 门店id
     */
    private Store store;
    private Integer sId;

    /**
     * 客户id
     */
    private Customer customer;
    private Integer cId;

    /**
     * 单据编号
     */
    private String documentnumber;

    /**
     * 单据类型
     */
    private String documenttype;

    /**
     * 单据状态（已登录、已退款）
     */
    private Integer documentstatus;

    /**
     * 单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date documentdate;

    /**
     * 应付金额
     */
    private Long yfamount;

    /**
     * 本次付款
     */
    private Long bcamount;

    /**
     * 合计余额
     */
    private Long sum;

    /**
     * 经手人
     */
    private String operator;

    /**
     * 收款单号
     */
    private String receiptnumber;

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
     * 时效性
     */
    private Integer timeliness;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 物资退款单号
     */
    private String returnedmaterialsid;

    private static final long serialVersionUID = 1L;
}