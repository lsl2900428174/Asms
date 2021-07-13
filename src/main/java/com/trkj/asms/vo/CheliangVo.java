package com.trkj.asms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class CheliangVo {
    private String sname;//门店名称
    private String cname;//客户名称
    private String cphone;//联系电话
    private String chepai;//车牌号
    private String bname;//品牌名称
    private String vsname;//车系名称
    private String bcname;//车身颜色
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date daoqiyers;//年检到期日
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date nextbytime;//下次保养时间
    private int nextbylichen;//下次保养里程
}
