package com.trkj.asms.service;

import com.trkj.asms.entity.Service;
import java.util.List;

/**
 * 维修类型表(Service)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 09:28:34
 */
public interface ServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param serviceid 主键
     * @return 实例对象
     */
    Service queryById(Integer serviceid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Service> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param service 实例对象
     * @return 实例对象
     */
    Service insert(Service service);

    /**
     * 修改数据
     *
     * @param service 实例对象
     * @return 实例对象
     */
    Service update(Service service);

    /**
     * 通过主键删除数据
     *
     * @param serviceid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer serviceid);

}