package com.trkj.asms.service;

import com.trkj.asms.entity.Mainbilling;

import com.trkj.asms.vo.*;

import java.util.List;

public interface MainbillingService {
    List<Mainbilling> selectMainbilling();
    Mainbilling insertMainbilling(Mainbilling mainbilling);
    Mainbilling updateMainbilling(Mainbilling mainbilling);





    List<WxmxhzVo> wxmxhz();
    List<WzcghzoVo> wzcghz();
    List<WzxshzVo> wzxshz();
    List<ZjyeVo> zjye();
    /**
     * 根据支付方式查询
     */
    List<DzmxVo> selectnumber(String settlementtype);
}

