package com.trkj.asms.service.impl;

import com.trkj.asms.dao.MainbillingDao;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;

import com.trkj.asms.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MainbillingServiceImpl implements MainbillingService {
    @Resource
    private MainbillingDao mainbillingDao;
    @Override
    public List<Mainbilling> selectMainbilling() {
        return mainbillingDao.selectMainbilling();
    }

    @Override
    public Mainbilling insertMainbilling(Mainbilling mainbilling) {
        mainbillingDao.insertMainbilling(mainbilling);
        return mainbilling;
    }

    @Override
    public Mainbilling updateMainbilling(Mainbilling mainbilling) {
        mainbillingDao.updateMainbilling(mainbilling);
        return mainbilling;
    }

    @Override
    public Mainbilling updateAllMainbilling(Mainbilling mainbilling) {
        mainbillingDao.updateAllMainbilling(mainbilling);
        return mainbilling;
    }

    @Override
    public List<WxmxhzVo> wxmxhz() {
        List<WxmxhzVo> list = this.mainbillingDao.wxmxhz();
        return list;
    }
    @Override
    public List<WzcghzoVo> wzcghz() {
        List<WzcghzoVo> list = this.mainbillingDao.wzcghz();
        return list;
    }
    @Override
    public List<WzxshzVo> wzxshz() {
        List<WzxshzVo> list = this.mainbillingDao.wzxshz();
        return list;
    }
    @Override
    public List<ZjyeVo> zjye() {
        List<ZjyeVo> list = this.mainbillingDao.zjye();
        return list;
    }
    /**
     * 根据支付方式查询
     */
    @Override
    public List<DzmxVo> selectnumber(String settlementtype) {
        return this.mainbillingDao.selectnumber(settlementtype);
    }
}
