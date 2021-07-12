package com.trkj.asms.service;

import com.trkj.asms.entity.Stock2;

import java.util.List;

/**
 * (Stock2)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:31:03
 */
public interface Stock2Service {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stock2 queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<Stock2> selectAll();

    /**
     * 新增数据
     *
     * @param stock2 实例对象
     * @return 实例对象
     */
    Stock2 insert(Stock2 stock2);

    /**
     * 修改数据
     *
     * @param stock2 实例对象
     * @return 实例对象
     */
    Stock2 update(Stock2 stock2);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
