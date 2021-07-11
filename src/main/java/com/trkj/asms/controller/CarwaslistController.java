package com.trkj.asms.controller;

import com.trkj.asms.entity.Carwaslist;
import com.trkj.asms.service.CarwaslistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Carwaslist)表控制层
 *
 * @author makejava
 * @since 2021-07-11 10:55:53
 */
@RestController
@RequestMapping("carwaslist")
public class CarwaslistController {
    /**
     * 服务对象
     */
    @Resource
    private CarwaslistService carwaslistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Carwaslist selectOne(Integer id) {
        return this.carwaslistService.queryById(id);
    }

}
