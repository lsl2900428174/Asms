package com.trkj.asms.service;

import com.trkj.asms.entity.WMaterialorder;

import java.util.List;

/**
 * 物资采购订单表和库存表(WMaterialorder)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 20:23:17
 */
public interface WMaterialorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param moId 主键
     * @return 实例对象
     */
    WMaterialorder queryById(Integer moId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WMaterialorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wMaterialorder 实例对象
     * @return 实例对象
     */
    WMaterialorder insert(WMaterialorder wMaterialorder);

    /**
     * 修改数据
     *
     * @param wMaterialorder 实例对象
     * @return 实例对象
     */
    WMaterialorder update(WMaterialorder wMaterialorder);

    /**
     * 通过主键删除数据
     *
     * @param moId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer moId);

}
