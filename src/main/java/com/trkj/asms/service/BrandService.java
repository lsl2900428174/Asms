package com.trkj.asms.service;

import com.trkj.asms.entity.Brand;

import java.util.List;

/**
 * 车辆品牌表(Brand)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:38:30
 */
public interface BrandService {
    List<Brand> findall();

    /**
     * 通过ID查询单条数据
     *
     * @param bId 主键
     * @return 实例对象
     */
    Brand queryById(Integer bId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Brand> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand insert(Brand brand);

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    Brand update(Brand brand);

    /**
     * 通过主键删除数据
     *
     * @param bId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bId);

}
