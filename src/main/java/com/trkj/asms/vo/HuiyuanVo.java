package com.trkj.asms.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class HuiyuanVo {
    private String sname;
    private String billcode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date billdate;
    private Integer billstate;
    private String cname;
    private String cphone;
    private String address;
    private String savingsno;
    private String storedtype;
    private Double giveamount;
    private Double storedvalue;
    private String username;
    private String remarks;
}
