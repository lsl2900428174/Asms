package com.trkj.asms.service;

import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Mainbilling;

import com.trkj.asms.vo.*;

import java.util.List;

public interface MainbillingService {
    List<Mainbilling> selectMainbilling();
    Mainbilling insertMainbilling(Mainbilling mainbilling);
    Mainbilling updateMainbilling(Mainbilling mainbilling);
    int updateAllMainbilling(Mainbilling mainbilling);




    PageInfo<WxmxhzVo> wxmxhz(int currentPage, int pageSize);
    PageInfo<WzcghzoVo> wzcghz(int currentPage, int pageSize);
    PageInfo<WzxshzVo> wzxshz(int currentPage, int pageSize);
    List<ZjyeVo> zjye();
    List<DzmxVo> xfjefx();
    List<DzmxVo> jzlx();
    List<DzmxVo> jzlx1();
    PageInfo<WxmxhzVo> flcx(WxmxhzVo wxmxhzVo , int currentPage, int pageSize);
    /**
     * 根据支付方式查询
     */
    List<DzmxVo> selectnumber(String settlementtype);
    /**
     * 查询给定的俩个时间节点之间的单据
     */
    List<WxmxhzVo> sjcx(String date1, String date2);
}

