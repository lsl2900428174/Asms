package com.trkj.asms.service;

import com.trkj.asms.entity.Series;

import java.util.List;

/**
 * 车辆车系表(Series)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:39:27
 */
public interface SeriesService {

    List<Series> findall();

    /**
     * 通过ID查询单条数据
     *
     * @param vsId 主键
     * @return 实例对象
     */
    Series queryById(Integer vsId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Series> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    Series insert(Series series);

    /**
     * 修改数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    Series update(Series series);

    /**
     * 通过主键删除数据
     *
     * @param vsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer vsId);

}
