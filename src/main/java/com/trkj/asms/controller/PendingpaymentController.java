package com.trkj.asms.controller;

import com.trkj.asms.entity.Pendingpayment;
import com.trkj.asms.service.PendingpaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 待付列表(Pendingpayment)表控制层
 *
 * @author makejava
 * @since 2021-07-12 07:46:53
 */
@RestController
@RequestMapping("pendingpayment")
public class PendingpaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PendingpaymentService pendingpaymentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Pendingpayment selectOne(Integer id) {
        return this.pendingpaymentService.queryById(id);
    }

}
