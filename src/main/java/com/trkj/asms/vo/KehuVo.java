package com.trkj.asms.vo;

import lombok.Data;

import java.util.Date;

@Data
public class KehuVo {
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
    private Date cDate;
}
