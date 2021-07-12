package com.trkj.asms.vo;

import lombok.Data;

@Data
public class DzmxVo {
    private String documentDate;
    private String documentNumber;
    private String documentType;
    private String cname;
    private String chepai;
    private String settlementType;
    private double orderamount;
    private double paidMoney;
    private double dqye;
    private String operator;
    private String remarks;
}
