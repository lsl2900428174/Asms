package com.trkj.asms.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * 维修领料出库单(WPickingoutorder)实体类
 *
 * @author makejava
 * @since 2021-07-12 13:29:18
 */
@Data
public class WPickingoutorder implements Serializable {
    private static final long serialVersionUID = -25737734774071863L;
    /**
     * 维修领料ID
     */
    private Integer poId;
    /**
     * 客户名称
     */
    private String username;
    /**
     * 客户电话
     */
    private String phone;
    /**
     * 车牌号
     */
    private String platenumber;
    /**
     * 车架号
     */
    private String framenumber;
    /**
     * 品牌
     */
    private String carbrandname;
    /**
     * 车系
     */
    private String carservicename;
    /**
     * 车型
     */
    private String carmodelsname;
    /**
     * 领料人员ID
     */
    private String pickuserId;
    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date billdate;
    /**
     * 维修领料编号
     */
    private String billcode;
    /**
     * 维修单号
     */
    private String repaircode;

    /**
     * 物资
     * @return
     */
    @JsonProperty(value = "wReturnedmaterials")
    private List<WReturnedmaterials> wReturnedmaterials;

}
