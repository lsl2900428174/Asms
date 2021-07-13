package com.trkj.asms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

/**
 * carwaslist
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class Carwaslist implements Serializable {
    /**
     * 编号
     */
    private Integer carid;

    /**
     * 所属门店id
     */
    private Store store;
    private Integer sId;

    /**
     * 车辆id
     */
    private Carmanagement carmanagement;
    private Integer carmagid;

    /**
     * 服务顾问编号
     */
    private Emp emp;
    private Integer eId;

    /**
     * 项目编号
     */
    private Projectsettings projectsettings;
    private Integer xiangmuid;

    /**
     * 客户id
     */
    private Customer customer;
    private Integer kehuid;

    /**
     * 单据编号
     */
    private String documentnumber;

    /**
     * 单据日期
     */
    private Date documentdate;

    /**
     * 单据状态(0表示已登录，1表示已付款)
     */
    private Integer documentstatus;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 应收金额
     */
    private BigDecimal amountreceivable;

    private static final long serialVersionUID = 1L;
}