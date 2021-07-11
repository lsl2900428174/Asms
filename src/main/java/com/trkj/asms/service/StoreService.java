package com.trkj.asms.service;

import com.trkj.asms.entity.Store;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 门店表(Store)表服务接口
 *
 * @author lishilong
 * @since 2021-07-11 11:12:06
 */
public interface StoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Store queryById(Integer sId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Store> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param store 实例对象
     * @return 实例对象
     */
    Store insert(Store store);

    /**
     * 修改数据
     *
     * @param store 实例对象
     * @return 实例对象
     */
    Store update(Store store);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sId);

}
