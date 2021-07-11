package com.trkj.asms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * maintenanceapp
 * @author 
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class MaintenanceappVo implements Serializable {
    /**
     * 维修预约id
     */
    private Integer maintenanceappid;

    /**
     * 维修类型id
     */
    private String servicename;

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
     * 车牌号id
     */
    private String chepai;
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
    private Integer mendianid;

    /**
     * 预约单号
     */
    private String appno;

    /**
     * 单据日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date yujisetcar;

    /**
     * 预计交车时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
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