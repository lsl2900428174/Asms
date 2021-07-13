package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.Refundorder;
import com.trkj.asms.service.RefundorderService;
import com.trkj.asms.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RefundorderController {
    @Autowired
    private RefundorderService refundorderService;
//    查询：退款表
    @GetMapping("/findrefundorder")
    public PageInfo<Refundorder> findrefundorder(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Refundorder> refundorderList=refundorderService.findRefundorder();
        PageInfo<Refundorder> dueinPageInfo=new PageInfo<>(refundorderList);
        return dueinPageInfo;
    }
//    新增：物资退货编号
    @PostMapping("/addrefundorder")
    public AjaxResponse addrefundorder(Refundorder refundorder){
        refundorder=refundorderService.addRefundorder(refundorder);
        return AjaxResponse.success(refundorder);
    }

}
