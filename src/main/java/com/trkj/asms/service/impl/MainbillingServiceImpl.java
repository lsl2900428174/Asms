package com.trkj.asms.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public int updateAllMainbilling(Mainbilling mainbilling) {
        return this.mainbillingDao.updateAllMainbilling(mainbilling);
    }

    @Override
    public PageInfo<WxmxhzVo> wxmxhz(int currentPage, int pageSize) {
        List<WxmxhzVo> list=this.mainbillingDao.wxmxhz(currentPage,pageSize);
        //封装分页插件
        PageHelper.startPage(currentPage,pageSize,true);
        //再查所有最终传过去的数据
        List<WxmxhzVo> list2 = this.mainbillingDao.wxmxhz(currentPage,pageSize);
        //封装到pageinfo再设置总条数获取第一个list的大小size()方法
        PageInfo<WxmxhzVo> info = new PageInfo<>(list2);
        info.setTotal(list.size());
        System.out.println(list);
        return info;
    }
    @Override
    public PageInfo<WzcghzoVo> wzcghz(int currentPage, int pageSize) {
        List<WzcghzoVo> list=this.mainbillingDao.wzcghz(currentPage,pageSize);
        //封装分页插件
        PageHelper.startPage(currentPage,pageSize,true);
        //再查所有最终传过去的数据
        List<WzcghzoVo> list2 = this.mainbillingDao.wzcghz(currentPage,pageSize);
        //封装到pageinfo再设置总条数获取第一个list的大小size()方法
        PageInfo<WzcghzoVo> info = new PageInfo<>(list2);
        info.setTotal(list.size());
        System.out.println(list);
        return info;
    }
    @Override
    public PageInfo<WzxshzVo> wzxshz(int currentPage, int pageSize) {
        List<WzxshzVo> list=this.mainbillingDao.wzxshz(currentPage,pageSize);
        //封装分页插件
        PageHelper.startPage(currentPage,pageSize,true);
        //再查所有最终传过去的数据
        List<WzxshzVo> list2 = this.mainbillingDao.wzxshz(currentPage,pageSize);
        //封装到pageinfo再设置总条数获取第一个list的大小size()方法
        PageInfo<WzxshzVo> info = new PageInfo<>(list2);
        info.setTotal(list.size());
        System.out.println(list);
        return info;
    }
    @Override
    public List<ZjyeVo> zjye() {
        List<ZjyeVo> list = this.mainbillingDao.zjye();
        return list;
    }
    @Override
    public List<DzmxVo> xfjefx() {
        List<DzmxVo> list = this.mainbillingDao.xfjefx();
        return list;
    }
    @Override
    public List<DzmxVo> jzlx() {
        List<DzmxVo> list = this.mainbillingDao.jzlx();
        return list;
    }
    @Override
    public List<DzmxVo> jzlx1() {
        List<DzmxVo> list = this.mainbillingDao.jzlx1();
        return list;
    }
    @Override
    public PageInfo<WxmxhzVo> flcx(WxmxhzVo wxmxhzVo, int currentPage, int pageSize) {
        List<WxmxhzVo> list=this.mainbillingDao.flcx(wxmxhzVo);
        //封装分页插件
        PageHelper.startPage(currentPage,pageSize,true);
        //再查所有最终传过去的数据
        List<WxmxhzVo> list2=this.mainbillingDao.flcx(wxmxhzVo);
        //封装到pageinfo再设置总条数获取第一个list的大小size()方法
        PageInfo<WxmxhzVo> info = new PageInfo<>(list);
        info.setTotal(list.size());
        System.out.println(list);
        return info;
    }
    /**
     * 根据支付方式查询
     */
    @Override
    public List<DzmxVo> selectnumber(String settlementtype) {
        return this.mainbillingDao.selectnumber(settlementtype);
    }
    @Override
    public List<WxmxhzVo> sjcx(String date1, String date2) {
        return this.mainbillingDao.sjcx(date1,date2);
    }
}
