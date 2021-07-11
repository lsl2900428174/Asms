package com.trkj.asms.service;

import com.trkj.asms.entity.WDeliveryorder;

import java.util.List;

/**
 * 物资采购退货出库单(WDeliveryorder)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 10:59:30
 */
public interface WDeliveryorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param doId 主键
     * @return 实例对象
     */
    WDeliveryorder queryById(Integer doId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WDeliveryorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wDeliveryorder 实例对象
     * @return 实例对象
     */
    WDeliveryorder insert(WDeliveryorder wDeliveryorder);

    /**
     * 修改数据
     *
     * @param wDeliveryorder 实例对象
     * @return 实例对象
     */
    WDeliveryorder update(WDeliveryorder wDeliveryorder);

    /**
     * 通过主键删除数据
     *
     * @param doId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer doId);

}
