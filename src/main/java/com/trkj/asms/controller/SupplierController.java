package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Carwaslist;
import com.trkj.asms.entity.Supplier;
import com.trkj.asms.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    //    模糊查询
    @GetMapping("/selectSupplierlike")
    public PageInfo<Supplier> selectSupplierlike(@RequestParam("suppliername") String suppliername, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Supplier> findSourcePage = supplierService.selectSupplierlike(suppliername);
        PageInfo<Supplier> findSourcePageInfo = new PageInfo<>(findSourcePage);
        return findSourcePageInfo;
    }
}
