package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.dao.MainbillingDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;

import com.trkj.asms.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class MainbillingServiceImpl implements MainbillingService {
    @Resource
    private MainbillingDao mainbillingDao;
    @Resource
    private DueinDao dueinDao;
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
//        添加收款单
        Duein duein=new Duein();
        duein.setCustomerid(mainbilling.getKehuid());
        duein.setDocumentdate(new Date());
        duein.setDocumentstatus(1);//已结算
        duein.setDocumentnumber(mainbilling.getMaintenanceapp().getAppno());//预约单号
        duein.setDocumenttype("维修开单");
        duein.setOrderamount(mainbilling.getYujiallmony());//预计总费用
        duein.setSId(mainbilling.getMendianid());//门店id
        duein.setCarmagid(mainbilling.getCarmanagement().getChepai());//车牌编号
        dueinDao.insertSelective(duein);
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
