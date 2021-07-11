package com.trkj.asms.controller;

import com.trkj.asms.entity.WDeliveryorder;
import com.trkj.asms.service.WDeliveryorderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 物资采购退货出库单(WDeliveryorder)表控制层
 *
 * @author makejava
 * @since 2021-07-11 10:59:38
 */
@RestController
@RequestMapping("wDeliveryorder")
public class WDeliveryorderController {
    /**
     * 服务对象
     */
    @Resource
    private WDeliveryorderService wDeliveryorderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WDeliveryorder selectOne(Integer id) {
        return this.wDeliveryorderService.queryById(id);
    }

}
