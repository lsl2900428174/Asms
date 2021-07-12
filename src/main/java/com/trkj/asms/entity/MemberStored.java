package com.trkj.asms.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (MemberStored)实体类
 *
 * @author makejava
 * @since 2021-07-12 02:38:43
 */
@Data
public class MemberStored implements Serializable {
    private static final long serialVersionUID = -58609063003373764L;
    /**
     * 会员id
     */
    private Integer mId;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 会员单据编号
     */
    private String billCode;
    /**
     * 单据时间
     */
    private Date billDate;
    /**
     * 客户名称
     */
    private String cName;
    /**
     * 联系电话
     */
    private String cPhone;
    /**
     * 单据状态
     */
    private Integer billState;
    /**
     * 储值卡号
     */
    private String savingsno;
    /**
     * 充值余额
     */
    private Double storedValue;
    /**
     * 赠送金额
     */
    private Double giveAmount;
    /**
     * 充值类型
     */
    private String storedType;
    /**
     * 员工名称
     */
    private String userName;
    /**
     * 地址
     */
    private String address;
    /**
     * 备注
     */
    private String remarks;




}
