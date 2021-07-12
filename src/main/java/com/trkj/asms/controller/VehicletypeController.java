package com.trkj.asms.controller;

import com.trkj.asms.entity.Vehicletype;
import com.trkj.asms.service.VehicletypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆类型表(Vehicletype)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:40:06
 */
@RestController
@RequestMapping("vehicletype")
public class VehicletypeController {
    /**
     * 服务对象
     */
    @Resource
    private VehicletypeService vehicletypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Vehicletype selectOne(Integer id) {
        return this.vehicletypeService.queryById(id);
    }

    /**
     * 查询所有车辆类型
     * @return
     */
    @GetMapping("findall")
    public List<Vehicletype> findall(){
        return this.vehicletypeService.findall();
    }

}
