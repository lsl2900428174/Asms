package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 维修开单表(Mainbilling)实体类
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
public class Mainbilling implements Serializable {
    private static final long serialVersionUID = 346885954640188041L;
    /**
    * 维修开单id
    */
    private Integer mainbillingid;
    /**
    * 维修类型id
    */
    private Integer serviceid;
    /**
    * 维修预约id
    */
    private Integer maintenanceappid;
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
    * 派工id
    */
    private Integer empids;
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
    private Double favourable;
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


    public Integer getMainbillingid() {
        return mainbillingid;
    }

    public void setMainbillingid(Integer mainbillingid) {
        this.mainbillingid = mainbillingid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public Integer getMaintenanceappid() {
        return maintenanceappid;
    }

    public void setMaintenanceappid(Integer maintenanceappid) {
        this.maintenanceappid = maintenanceappid;
    }

    public Integer getKehuid() {
        return kehuid;
    }

    public void setKehuid(Integer kehuid) {
        this.kehuid = kehuid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getXiangmuid() {
        return xiangmuid;
    }

    public void setXiangmuid(Integer xiangmuid) {
        this.xiangmuid = xiangmuid;
    }

    public Integer getCailiaoid() {
        return cailiaoid;
    }

    public void setCailiaoid(Integer cailiaoid) {
        this.cailiaoid = cailiaoid;
    }

    public Integer getMendianid() {
        return mendianid;
    }

    public void setMendianid(Integer mendianid) {
        this.mendianid = mendianid;
    }

    public Integer getEmpids() {
        return empids;
    }

    public void setEmpids(Integer empids) {
        this.empids = empids;
    }

    public Integer getPaigongsta() {
        return paigongsta;
    }

    public void setPaigongsta(Integer paigongsta) {
        this.paigongsta = paigongsta;
    }

    public String getMainbillingno() {
        return mainbillingno;
    }

    public void setMainbillingno(String mainbillingno) {
        this.mainbillingno = mainbillingno;
    }

    public Date getMainorder() {
        return mainorder;
    }

    public void setMainorder(Date mainorder) {
        this.mainorder = mainorder;
    }

    public Integer getMainorderstuta() {
        return mainorderstuta;
    }

    public void setMainorderstuta(Integer mainorderstuta) {
        this.mainorderstuta = mainorderstuta;
    }

    public Date getYujisetcar() {
        return yujisetcar;
    }

    public void setYujisetcar(Date yujisetcar) {
        this.yujisetcar = yujisetcar;
    }

    public Date getYujisetcartime() {
        return yujisetcartime;
    }

    public void setYujisetcartime(Date yujisetcartime) {
        this.yujisetcartime = yujisetcartime;
    }

    public String getKehudepict() {
        return kehudepict;
    }

    public void setKehudepict(String kehudepict) {
        this.kehudepict = kehudepict;
    }

    public String getSuichewup() {
        return suichewup;
    }

    public void setSuichewup(String suichewup) {
        this.suichewup = suichewup;
    }

    public Integer getWangongsta() {
        return wangongsta;
    }

    public void setWangongsta(Integer wangongsta) {
        this.wangongsta = wangongsta;
    }

    public Date getWangongtime() {
        return wangongtime;
    }

    public void setWangongtime(Date wangongtime) {
        this.wangongtime = wangongtime;
    }

    public Double getFavourable() {
        return favourable;
    }

    public void setFavourable(Double favourable) {
        this.favourable = favourable;
    }

    public Double getYujiallmony() {
        return yujiallmony;
    }

    public void setYujiallmony(Double yujiallmony) {
        this.yujiallmony = yujiallmony;
    }

    public Date getOvermonytime() {
        return overmonytime;
    }

    public void setOvermonytime(Date overmonytime) {
        this.overmonytime = overmonytime;
    }

    public Integer getOrfanxiu() {
        return orfanxiu;
    }

    public void setOrfanxiu(Integer orfanxiu) {
        this.orfanxiu = orfanxiu;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

}