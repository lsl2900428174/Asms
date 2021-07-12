package com.trkj.asms.service;

import com.trkj.asms.entity.Pendingpayment;

import java.util.List;

/**
 * 待付列表(Pendingpayment)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 07:46:48
 */
public interface PendingpaymentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Pendingpayment queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Pendingpayment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param pendingpayment 实例对象
     * @return 实例对象
     */
    Pendingpayment insert(Pendingpayment pendingpayment);

    /**
     * 修改数据
     *
     * @param pendingpayment 实例对象
     * @return 实例对象
     */
    Pendingpayment update(Pendingpayment pendingpayment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
