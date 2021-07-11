package com.trkj.asms.controller;

import com.trkj.asms.entity.Store;
import com.trkj.asms.service.StoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 门店表(Store)表控制层
 *
 * @author lishilong
 * @since 2021-07-11 11:12:07
 */
@RestController
@RequestMapping("store")
public class StoreController {
    /**
     * 服务对象
     */
    @Resource
    private StoreService storeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Store selectOne(Integer id) {
        return this.storeService.queryById(id);
    }

}
