package com.trkj.asms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * mainbilling
 * @author 
 */
@Data
public class Mainbilling implements Serializable {
    /**
     * 维修开单id
     */
    private Integer mainbillingid;

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
    private Customer customer;
    private Integer kehuid;

    /**
     * 员工id
     */
    private Emp emp;
    private Integer empid;

    /**
     * 项目id
     */
    private Projectsettings projectsettings;
    private Integer xiangmuid;

    /**
     * 材料id
     */
    private Commodity commodity;
    private Integer cailiaoid;

    /**
     * 门店id
     */
    private Store store;
    private Integer mendianid;

    /**
     * 派工id
     */
    private Carmanagement carmanagement;
    private Integer chepai;

    /**
     * 派工状态
     */
    private Integer paigongsta;

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
     * 完工状态
     */
    private Integer wangongsta;

    /**
     * 完工时间
     */
    private Date wangongtime;

    /**
     * 优惠金额
     */
    private BigDecimal favourable;

    /**
     * 预计总费用
     */
    private BigDecimal yujiallmony;

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

    private static final long serialVersionUID = 1L;
}