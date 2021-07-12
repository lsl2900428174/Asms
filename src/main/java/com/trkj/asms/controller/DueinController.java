package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.service.DueinService;
import com.trkj.asms.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class DueinController {
    @Autowired
    private DueinService dueinService;
//    待收列表：查询待收款过收款单
    @GetMapping("/findduein")
    public AjaxResponse findduein(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Duein> dueinList=dueinService.findduein();
        PageInfo<Duein> dueinPageInfo=new PageInfo<>(dueinList);

        return AjaxResponse.success(dueinPageInfo);
    }
//    新增：获取开单中的维修开单编号、洗车编号；获取客户会员充值的编号；获取仓库中的采购订单退货编号、物资出库编号
    @PostMapping("/addduein")
    public AjaxResponse addduein(@RequestBody Duein duein){
        duein=dueinService.adddueinAll(duein);
        return AjaxResponse.success(duein);
    }
}
