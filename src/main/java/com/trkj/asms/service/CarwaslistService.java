package com.trkj.asms.service;

import com.trkj.asms.entity.Carwaslist;
import java.util.List;

/**
 * (Carwaslist)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 00:05:39
 */
public interface CarwaslistService {

    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    Carwaslist queryById(Integer carid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Carwaslist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carwaslist 实例对象
     * @return 实例对象
     */
    Carwaslist insert(Carwaslist carwaslist);

    /**
     * 修改数据
     *
     * @param carwaslist 实例对象
     * @return 实例对象
     */
    Carwaslist update(Carwaslist carwaslist);

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer carid);

}