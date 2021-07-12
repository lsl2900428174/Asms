package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Pendingpayment;
import com.trkj.asms.service.PendingpaymentService;
import com.trkj.asms.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 待付列表(Pendingpayment)表控制层
 *
 * @author makejava
 * @since 2021-07-12 07:46:53
 */
@RestController
@Slf4j
public class PendingpaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PendingpaymentService pendingpaymentService;


    //    查询待付款列表或付款单
    @GetMapping("/findAll")
    public AjaxResponse findAll(){
//        @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize
//        PageHelper.startPage(currentPage,pagesize);
        List<Pendingpayment> pendingpaymentList=pendingpaymentService.findAllpending();
//        PageInfo<Pendingpayment> dueinPageInfo=new PageInfo<>(pendingpaymentList);

//        log.debug("hhh"+pendingpaymentList.toString());
        return AjaxResponse.success(pendingpaymentList);
    }
    //新增待付列表获知是付款单：获取采购订单编号（  获取采购入库编号）
    @PostMapping("/AddAll")
    public AjaxResponse AddAll(@RequestBody Pendingpayment pendingpayment){
        pendingpayment=pendingpaymentService.Addpending(pendingpayment);
        return AjaxResponse.success(pendingpayment);
    }
//    付款:待付款的单据状态订单改为“已结算”
    @PutMapping("/updatestatus")
    public AjaxResponse updatestatus(@RequestBody Pendingpayment pendingpayment){
        pendingpayment=pendingpaymentService.updatestatus(pendingpayment);
        return AjaxResponse.success(pendingpayment);
    }

}
