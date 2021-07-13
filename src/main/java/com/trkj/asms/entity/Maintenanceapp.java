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
 * maintenanceapp
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class Maintenanceapp implements Serializable {
    /**
     * 维修预约id
     */
    private Integer maintenanceappid;

    /**
     * 维修类型id
     */
    private Service service;
    private Integer serviceid;

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
     * 车辆id
     */

    private Integer chepai;

    /**
     * 预约单号
     */
    private String appno;

    /**
     * 单据日期
     */
    private Date mainorder;

    /**
     * 单据状态
     */
    private Integer mainorderstuta;

    /**
     * 预计总费用
     */
    private BigDecimal yujiallmony;

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
     * 失约原因
     */
    private String shiyucause;

    /**
     * 备注
     */
    private String beizhu;

    /**
     * 车牌id
     */
    private Carmanagement carmanagement;
    private Integer carid;

    private static final long serialVersionUID = 1L;
}