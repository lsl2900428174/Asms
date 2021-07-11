package com.trkj.asms.controller;

import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 维修开单表(Mainbilling)表控制层
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
@RestController
@RequestMapping("mainbilling")
public class MainbillingController {
    /**
     * 服务对象
     */
    @Resource
    private MainbillingService mainbillingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Mainbilling selectOne(Integer id) {
        return this.mainbillingService.queryById(id);
    }

}