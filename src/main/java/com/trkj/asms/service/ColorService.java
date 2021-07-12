package com.trkj.asms.service;

import com.trkj.asms.entity.Color;

import java.util.List;

/**
 * 车身颜色表(Color)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:41:11
 */
public interface ColorService {

    List<Color> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param bcId 主键
     * @return 实例对象
     */
    Color queryById(Integer bcId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Color> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    Color insert(Color color);

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    Color update(Color color);

    /**
     * 通过主键删除数据
     *
     * @param bcId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bcId);

}
