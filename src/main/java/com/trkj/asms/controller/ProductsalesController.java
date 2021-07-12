package com.trkj.asms.controller;

import com.trkj.asms.entity.Productsales;
import com.trkj.asms.service.ProductsalesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用品销售表(Productsales)表控制层
 *
 * @author makejava
 * @since 2021-07-12 00:58:50
 */
@RestController
@RequestMapping("productsales")
public class ProductsalesController {
    /**
     * 服务对象
     */
    @Resource
    private ProductsalesService productsalesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Productsales selectOne( id) {
        return this.productsalesService.queryById(id);
    }

}