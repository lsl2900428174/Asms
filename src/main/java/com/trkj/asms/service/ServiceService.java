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
     * @param
     * @return 实例对象
     */
    List<Service> queryById();



}