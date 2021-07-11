package com.trkj.asms.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * maintenanceapp
 * @author 
 */
@Data
public class Maintenanceapp implements Serializable {
    /**
     * 维修预约id
     */
    private Integer maintenanceappid;

    /**
     * 维修类型id
     */
    private Integer serviceid;

    /**
     * 车牌号id
     */
    private Integer carid;

    /**
     * 客户id
     */
    private Integer kehuid;

    /**
     * 员工id
     */
    private Integer empid;

    /**
     * 项目id
     */
    private Integer xiangmuid;

    /**
     * 材料id
     */
    private Integer cailiaoid;

    /**
     * 门店id
     */
    private Integer mendianid;

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

    private static final long serialVersionUID = 1L;
}