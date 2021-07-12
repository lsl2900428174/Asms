package com.trkj.asms.service;

import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.vo.MainbillingVo;

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

//    模糊查询显示
    List<MainbillingVo> queryAllByLimit(String c_name);

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

}