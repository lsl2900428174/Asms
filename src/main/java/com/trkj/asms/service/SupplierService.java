package com.trkj.asms.service;

import com.trkj.asms.entity.Supplier;

import java.util.List;

/**
 * (Supplier)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 20:17:40
 */
public interface SupplierService {
//模糊查询
    List<Supplier> selectSupplierlike(String suppliername);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Supplier> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    Supplier insert(Supplier supplier);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<Supplier> queryAll();
}
