package com.trkj.asms.service;

import com.trkj.asms.entity.Vehicletype;

import java.util.List;

/**
 * 车辆类型表(Vehicletype)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:40:06
 */
public interface VehicletypeService {

    List<Vehicletype> findall();

    /**
     * 通过ID查询单条数据
     *
     * @param vId 主键
     * @return 实例对象
     */
    Vehicletype queryById(Integer vId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Vehicletype> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param vehicletype 实例对象
     * @return 实例对象
     */
    Vehicletype insert(Vehicletype vehicletype);

    /**
     * 修改数据
     *
     * @param vehicletype 实例对象
     * @return 实例对象
     */
    Vehicletype update(Vehicletype vehicletype);

    /**
     * 通过主键删除数据
     *
     * @param vId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer vId);

}
