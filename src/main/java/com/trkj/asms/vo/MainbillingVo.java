package com.trkj.asms.vo;

import com.trkj.asms.entity.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 维修开单表(Mainbilling)实体类
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class MainbillingVo implements Serializable {
    private static final long serialVersionUID = 346885954640188041L;
    /**
    * 维修开单id
    */
    private String servicename;
    /**
    * 维修类型id
    */
    private Service service;
    private Integer serviceid;
    /**
    * 维修预约id
    */
    private Maintenanceapp maintenanceapp;
    private Integer maintenanceappid;
    /**
    * 客户id
    */
    private String c_name;
    private String c_phone;
    /**
    * 员工id
    */
    private String Name;
    /**
    * 项目id
    */
    private String WorkHours;
    private BigDecimal CustAccountPrcie;
    /**
    * 材料id
    */
    private BigDecimal cusprice;
    /**
    * 门店id
    */
    private Store store;
    private Integer mendianid;
    /**
    * 单据编号
    */
    private String mainbillingno;
    /**
    * 单据日期
    */
    private Date mainorder;
    /**
    * 单据状态
    */
    private Integer mainorderstuta;
    /**
    * 预计进厂时间
    */
    private Date yujisetcar;
    /**
    * 预计交车时间
    */
    private Date yujisetcartime;
    /**
    * 客户描述
    */
    private String kehudepict;
    /**
    * 随车物品
    */
    private String suichewup;
    /**
    * 预计总费用
    */
    private Double yujiallmony;
    /**
    * 结算时间
    */
    private Date overmonytime;
    /**
    * 是否被返修
    */
    private Integer orfanxiu;
    /**
    * 备注
    */
    private String beizhu;

}