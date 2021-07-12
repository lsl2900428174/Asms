package com.trkj.asms.controller;

import com.trkj.asms.entity.Customertype;
import com.trkj.asms.service.CustomertypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户类型表(Customertype)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:00:42
 */
@RestController
@RequestMapping("customertype")
public class CustomertypeController {
    /**
     * 服务对象
     */
    @Resource
    private CustomertypeService customertypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Customertype selectOne(Integer id) {
        return this.customertypeService.queryById(id);
    }

    /**
     * 查询所有客户类型
     * @return
     */
    @GetMapping("findall")
    public List<Customertype> findall(){
        return this.customertypeService.findall();
    }

}
