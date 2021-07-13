package com.trkj.asms.service;

import com.trkj.asms.entity.Materialbrand;

import java.util.List;

/**
 * 物资品牌表(Materialbrand)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 20:02:06
 */
public interface MaterialbrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    Materialbrand queryById(Integer mId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Materialbrand> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param materialbrand 实例对象
     * @return 实例对象
     */
    Materialbrand insert(Materialbrand materialbrand);

    /**
     * 修改数据
     *
     * @param materialbrand 实例对象
     * @return 实例对象
     */
    Materialbrand update(Materialbrand materialbrand);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mId);

    List<Materialbrand> queryAll();
}
