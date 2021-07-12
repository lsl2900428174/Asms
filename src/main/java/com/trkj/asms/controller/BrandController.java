package com.trkj.asms.controller;

import com.trkj.asms.entity.Brand;
import com.trkj.asms.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆品牌表(Brand)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:38:30
 */
@RestController
@RequestMapping("brand")
public class BrandController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Brand selectOne(Integer id) {
        return this.brandService.queryById(id);
    }

    /**
     * 查询所有车辆品牌
     * @return
     */
    @GetMapping("findall")
    public List<Brand> findall(){
        return this.brandService.findall();
    }

}
