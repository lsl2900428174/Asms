package com.trkj.asms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.io.Serializable;

/**
 * (Supplier)实体类
 *
 * @author makejava
 * @since 2021-07-12 20:31:21
 */
@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
@NonNull
public class Supplier implements Serializable {
    private static final long serialVersionUID = -46800492997878916L;
    /**
     * 供货商id
     */
    private Integer id;
    /**
     * 供货商编码
     */
    private String supplierCode;
    /**
     * 供货商名称
     */
    private String suppliername;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系电话
     */
    private String contactnumber;
    /**
     * 供货商类型id
     */
    private Suppliertype suppliertype;
    private Integer suptypeid;
    /**
     * 所属地区
     */
    private Address address;
    private Integer addressid;
    /**
     * 门店id
     */
    private Store store;
    private Integer sId;
    /**
     * 应付金额
     */
    private Double payablemoney;
    /**
     * 实付金额
     */
    private Double paidMoney;
    /**
     * 所属门店
     */
    private Integer sStore;
    /**
     * 初期金额
     */
    private Double money;
    /**
     * 状态 0:正常 1:禁用
     */
    private Integer statik;
    /**
     * 1:正常，0：默认客户
     */
    private Integer ismoren;
    /**
     * 联系地址
     */
    private String lxaddress;
    /**
     * 创建时间
     */
    private Date cjtime;
    /**
     * 备注
     */
    private String beizhu;

}
