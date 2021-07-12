package com.trkj.asms.entity;

import java.io.Serializable;

/**
 * 项目设置表(Projectsettings)实体类
 *
 * @author makejava
 * @since 2021-07-12 09:41:08
 */
public class Projectsettings implements Serializable {
    private static final long serialVersionUID = -27860234508057827L;
    /**
    * 项目id
    */
    private Integer pId;
    /**
    * 服务类别id
    */
    private Integer servetypeid;
    /**
    * 部位id
    */
    private Integer siteid;
    /**
    * 门店id
    */
    private Integer sId;
    /**
    * 项目编码
    */
    private String projectcode;
    /**
    * 项目名称
    */
    private String projectname;
    /**
    * 打折状态
    */
    private Integer state;
    /**
    * 备注
    */
    private String remarks;
    /**
    * 标签类别
    */
    private String typeLabel;
    /**
    * 维修车类
    */
    private Integer typeid;
    /**
    * 标准工时
    */
    private String workhours;
    /**
    * 客账单价
    */
    private Double custaccountprcie;
    /**
    * 内部单价
    */
    private Double insideprice;
    /**
    * 索赔单价
    */
    private Double claimantprcie;


    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getServetypeid() {
        return servetypeid;
    }

    public void setServetypeid(Integer servetypeid) {
        this.servetypeid = servetypeid;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTypeLabel() {
        return typeLabel;
    }

    public void setTypeLabel(String typeLabel) {
        this.typeLabel = typeLabel;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getWorkhours() {
        return workhours;
    }

    public void setWorkhours(String workhours) {
        this.workhours = workhours;
    }

    public Double getCustaccountprcie() {
        return custaccountprcie;
    }

    public void setCustaccountprcie(Double custaccountprcie) {
        this.custaccountprcie = custaccountprcie;
    }

    public Double getInsideprice() {
        return insideprice;
    }

    public void setInsideprice(Double insideprice) {
        this.insideprice = insideprice;
    }

    public Double getClaimantprcie() {
        return claimantprcie;
    }

    public void setClaimantprcie(Double claimantprcie) {
        this.claimantprcie = claimantprcie;
    }

}