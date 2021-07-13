package com.trkj.asms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class KehuVo {
    private Integer sId;//分店id
    private String sName;//分店名称
    private String cName;//客户名称
    private String cPhone;
    private String cGender;
    private String cContacts;
    private String ctName;//类型名称
    private String savingsno;//储值卡号
    private String cAddress;
    private String name;//员工名称
    private String cText;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date cDate;
}
