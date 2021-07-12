package com.trkj.asms.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 员工表(Emp)实体类
 *
 * @author makejava
 * @since 2021-07-11 21:06:39
 */
@Data
public class Emp implements Serializable {
    private static final long serialVersionUID = -69909506371687239L;
    /**
     * 编号
     */
    private Integer eId;
    /**
     * 门店id
     */
    private Integer sId;
    /**
     * 岗位id
     */
    private Integer pId;
    /**
     * 部门id
     */
    private Integer dId;
    /**
     * 性别
     */
    private String sex;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 登录账号
     */
    private String loginid;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 修改时间
     */
    private Date updatetime;
    /**
     * 修改人
     */
    private String updatename;
    /**
     * 删除时间
     */
    private Date deletetime;
    /**
     * 删除人
     */
    private String deletename;
    /**
     * 时效性：未过期为0，已过期为1
     */
    private Integer timeliness;
    /**
     * 操作人
     */
    private String createusername;
    /**
     * 新增时间
     */
    private Date addtime;


    public Integer getEId() {
        return eId;
    }

    public void setEId(Integer eId) {
        this.eId = eId;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public Integer getPId() {
        return pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatename() {
        return updatename;
    }

    public void setUpdatename(String updatename) {
        this.updatename = updatename;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public String getDeletename() {
        return deletename;
    }

    public void setDeletename(String deletename) {
        this.deletename = deletename;
    }

    public Integer getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(Integer timeliness) {
        this.timeliness = timeliness;
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

}
