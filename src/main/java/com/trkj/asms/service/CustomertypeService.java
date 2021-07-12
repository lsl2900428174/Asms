package com.trkj.asms.service;

import com.trkj.asms.entity.Customertype;

import java.util.List;

/**
 * 客户类型表(Customertype)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:00:42
 */
public interface CustomertypeService {
    List<Customertype> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param ctId 主键
     * @return 实例对象
     */
    Customertype queryById(Integer ctId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customertype> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customertype 实例对象
     * @return 实例对象
     */
    Customertype insert(Customertype customertype);

    /**
     * 修改数据
     *
     * @param customertype 实例对象
     * @return 实例对象
     */
    Customertype update(Customertype customertype);

    /**
     * 通过主键删除数据
     *
     * @param ctId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ctId);

}
