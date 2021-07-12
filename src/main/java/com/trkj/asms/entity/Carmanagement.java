package com.trkj.asms.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 车辆管理表(Carmanagement)实体类
 *
 * @author makejava
 * @since 2021-07-12 00:38:32
 */
public class Carmanagement implements Serializable {
    private static final long serialVersionUID = -18178651945795232L;
    /**
     * 车辆id
     */
    private Integer carmagid;
    /**
     * 车辆品牌id
     */
    private Integer bId;
    /**
     * 车系id
     */
    private Integer vsId;
    /**
     * 车辆类型id
     */
    private Integer vId;
    /**
     * 内饰颜色id
     */
    private Integer iId;
    /**
     * 车身颜色id
     */
    private Integer bcId;
    /**
     * 车型id
     */
    private Integer mId;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 客户表_id
     */
    private Integer cId;
    /**
     * 车牌号
     */
    private String chepai;
    /**
     * 车架号
     */
    private String chejiano;
    /**
     * 发动机号
     */
    private String fadongjino;
    /**
     * 座位数
     */
    private Integer zuoweinumber;
    /**
     * 购车日期
     */
    private Date buydate;
    /**
     * 到期年检日
     */
    private Date daoqiyers;
    /**
     * 最新里程
     */
    private Integer newlichen;
    /**
     * 下次保养时间
     */
    private Date nextbytime;
    /**
     * 下次保养里程
     */
    private Integer nextbylichen;
    /**
     * 是否为本店购买
     */
    private String yesorno;
    /**
     * 备注
     */
    private String beizhu;
    /**
     * 建议
     */
    private String jianyi;


    public Integer getCarmagid() {
        return carmagid;
    }

    public void setCarmagid(Integer carmagid) {
        this.carmagid = carmagid;
    }

    public Integer getBId() {
        return bId;
    }

    public void setBId(Integer bId) {
        this.bId = bId;
    }

    public Integer getVsId() {
        return vsId;
    }

    public void setVsId(Integer vsId) {
        this.vsId = vsId;
    }

    public Integer getVId() {
        return vId;
    }

    public void setVId(Integer vId) {
        this.vId = vId;
    }

    public Integer getIId() {
        return iId;
    }

    public void setIId(Integer iId) {
        this.iId = iId;
    }

    public Integer getBcId() {
        return bcId;
    }

    public void setBcId(Integer bcId) {
        this.bcId = bcId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getCId() {
        return cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getChepai() {
        return chepai;
    }

    public void setChepai(String chepai) {
        this.chepai = chepai;
    }

    public String getChejiano() {
        return chejiano;
    }

    public void setChejiano(String chejiano) {
        this.chejiano = chejiano;
    }

    public String getFadongjino() {
        return fadongjino;
    }

    public void setFadongjino(String fadongjino) {
        this.fadongjino = fadongjino;
    }

    public Integer getZuoweinumber() {
        return zuoweinumber;
    }

    public void setZuoweinumber(Integer zuoweinumber) {
        this.zuoweinumber = zuoweinumber;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }

    public Date getDaoqiyers() {
        return daoqiyers;
    }

    public void setDaoqiyers(Date daoqiyers) {
        this.daoqiyers = daoqiyers;
    }

    public Integer getNewlichen() {
        return newlichen;
    }

    public void setNewlichen(Integer newlichen) {
        this.newlichen = newlichen;
    }

    public Date getNextbytime() {
        return nextbytime;
    }

    public void setNextbytime(Date nextbytime) {
        this.nextbytime = nextbytime;
    }

    public Integer getNextbylichen() {
        return nextbylichen;
    }

    public void setNextbylichen(Integer nextbylichen) {
        this.nextbylichen = nextbylichen;
    }

    public String getYesorno() {
        return yesorno;
    }

    public void setYesorno(String yesorno) {
        this.yesorno = yesorno;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    public String getJianyi() {
        return jianyi;
    }

    public void setJianyi(String jianyi) {
        this.jianyi = jianyi;
    }

}
