package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Service;
import com.trkj.asms.dao.ServiceDao;
import com.trkj.asms.service.ServiceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维修类型表(Service)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 09:28:34
 */
@RestController
@Slf4j
public class ServiceServiceImpl implements ServiceService {
    @Resource
    private ServiceDao serviceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param serviceid 主键
     * @return 实例对象
     */
    @Override
    public Service queryById(Integer serviceid) {
        return this.serviceDao.queryById(serviceid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Service> queryAllByLimit(int offset, int limit) {
        return this.serviceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param service 实例对象
     * @return 实例对象
     */
    @Override
    public Service insert(Service service) {
        this.serviceDao.insert(service);
        return service;
    }

    /**
     * 修改数据
     *
     * @param service 实例对象
     * @return 实例对象
     */
    @Override
    public Service update(Service service) {
        this.serviceDao.update(service);
        return this.queryById(service.getServiceid());
    }

    /**
     * 通过主键删除数据
     *
     * @param serviceid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer serviceid) {
        return this.serviceDao.deleteById(serviceid) > 0;
    }
}