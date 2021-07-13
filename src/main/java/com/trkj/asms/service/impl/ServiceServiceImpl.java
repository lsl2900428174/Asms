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
     * @param
     * @return 实例对象
     */
    @Override
    public List<Service> queryById() {
        return serviceDao.queryById();
    }


}