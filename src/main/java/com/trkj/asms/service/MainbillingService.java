package com.trkj.asms.service;

import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.vo.*;

import java.util.List;

/**
 * 维修开单表(Mainbilling)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
public interface MainbillingService {

    /**
     * 通过ID查询单条数据
     *
     * @param mainbillingid 主键
     * @return 实例对象
     */
    Mainbilling queryById(Integer mainbillingid);

    /**
     * 新增数据
     *
     * @param mainbilling 实例对象
     * @return 实例对象
     */
    Mainbilling insert(Mainbilling mainbilling);

    /**
     * 修改数据
     *
     * @param mainbilling 实例对象
     * @return 实例对象
     */
    Mainbilling update(Mainbilling mainbilling);

    /**
     * 通过主键删除数据
     *
     * @param mainbillingid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mainbillingid);
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