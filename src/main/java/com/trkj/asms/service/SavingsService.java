package com.trkj.asms.service;

import com.trkj.asms.entity.Savings;

import java.util.List;

/**
 * (Savings)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 02:41:58
 */
public interface SavingsService {

    /**
     * 通过ID查询单条数据
     *
     * @param savingsid 主键
     * @return 实例对象
     */
    Savings queryById(Integer savingsid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Savings> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param savings 实例对象
     * @return 实例对象
     */
    Savings insert(Savings savings);

    /**
     * 修改数据
     *
     * @param savings 实例对象
     * @return 实例对象
     */
    Savings update(Savings savings);

    /**
     * 通过主键删除数据
     *
     * @param savingsid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer savingsid);

}
