package com.trkj.asms.controller;

import com.trkj.asms.entity.Service;
import com.trkj.asms.service.ServiceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维修类型表(Service)表控制层
 *
 * @author makejava
 * @since 2021-07-12 09:28:34
 */
@RestController
@RequestMapping("service")
public class ServiceController {
    /**
     * 服务对象
     */
    @Resource
    private ServiceService serviceService;


    @GetMapping("/selectOne")
    public List<Service> selectOne() {
        return serviceService.queryById();
    }

}