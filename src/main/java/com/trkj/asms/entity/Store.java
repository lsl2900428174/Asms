package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 门店表(Store)实体类
 *
 * @author lishilong
 * @since 2021-07-11 11:12:06
 */
public class Store implements Serializable {
    private static final long serialVersionUID = -93545707751222599L;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 门店编码
     */
    private String sNumber;
    /**
     * 门店名称
     */
    private String sName;
    /**
     * 门店全称
     */
    private String sFullname;
    /**
     * 公司领导
     */
    private String sLeader;
    /**
     * 门店地址
     */
    private String sAddress;
    /**
     * 联系电话
     */
    private String sPhone;
    /**
     * 门店状态
     */
    private Integer sStatus;


    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getSNumber() {
        return sNumber;
    }

    public void setSNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public String getSName() {
        return sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public String getSFullname() {
        return sFullname;
    }

    public void setSFullname(String sFullname) {
        this.sFullname = sFullname;
    }

    public String getSLeader() {
        return sLeader;
    }

    public void setSLeader(String sLeader) {
        this.sLeader = sLeader;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public Integer getSStatus() {
        return sStatus;
    }

    public void setSStatus(Integer sStatus) {
        this.sStatus = sStatus;
    }

}
