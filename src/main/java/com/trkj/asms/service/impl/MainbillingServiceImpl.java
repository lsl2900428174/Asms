package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.dao.MainbillingDao;
import com.trkj.asms.service.MainbillingService;
import com.trkj.asms.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维修开单表(Mainbilling)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
@Service("mainbillingService")
public class MainbillingServiceImpl implements MainbillingService {
    @Resource
    private MainbillingDao mainbillingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mainbillingid 主键
     * @return 实例对象
     */
    @Override
    public Mainbilling queryById(Integer mainbillingid) {
        return this.mainbillingDao.queryById(mainbillingid);
    }

//    模糊查询显示
    @Override
    public List<MainbillingVo> queryAllByLimit(String c_name) {
        return this.mainbillingDao.queryAllByLimit(c_name);
    }

    /**
     * 新增数据
     *
     * @param mainbilling 实例对象
     * @return 实例对象
     */
    @Override
    public Mainbilling insert(Mainbilling mainbilling) {
        this.mainbillingDao.insert(mainbilling);
        return mainbilling;
    }

    /**
     * 修改数据
     *
     * @param mainbilling 实例对象
     * @return 实例对象
     */
    @Override
    public Mainbilling update(Mainbilling mainbilling) {
        this.mainbillingDao.update(mainbilling);
        return this.queryById(mainbilling.getMainbillingid());
    }

    /**
     * 通过主键删除数据
     *
     * @param mainbillingid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mainbillingid) {
        return this.mainbillingDao.deleteById(mainbillingid) > 0;
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