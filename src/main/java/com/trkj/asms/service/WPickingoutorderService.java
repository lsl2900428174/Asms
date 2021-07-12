package com.trkj.asms.service;

import com.trkj.asms.entity.WPickingoutorder;

import java.util.List;

/**
 * 维修领料出库单(WPickingoutorder)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 13:29:18
 */
public interface WPickingoutorderService {

    /**
     * 通过ID查询单条数据
     *
     * @param poId 主键
     * @return 实例对象
     */
    WPickingoutorder queryById(Integer poId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WPickingoutorder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wPickingoutorder 实例对象
     * @return 实例对象
     */
    boolean insert(WPickingoutorder wPickingoutorder);

    /**
     * 修改数据
     *
     * @param wPickingoutorder 实例对象
     * @return 实例对象
     */
    WPickingoutorder update(WPickingoutorder wPickingoutorder);

    /**
     * 通过主键删除数据
     *
     * @param poId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer poId);

}
