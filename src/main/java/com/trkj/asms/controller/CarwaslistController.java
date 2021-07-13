package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Carwaslist;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.CarwaslistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarwaslistController {
    @Autowired
    private CarwaslistService carwaslistService;
    //    模糊查询
    @GetMapping("/selectAllCarwashlike")
    public PageInfo<Carwaslist> selectAllCarwashlike(@RequestParam("name") String name, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<Carwaslist> findSourcePage = carwaslistService.selectAllCarwashlike(name);
        PageInfo<Carwaslist> findSourcePageInfo = new PageInfo<>(findSourcePage);
        return findSourcePageInfo;
    }
//    增加
    @PostMapping("/insertCarwaslist")
    public Carwaslist insertCarwaslist(@RequestBody Carwaslist carwaslist){
        carwaslistService.insertCarwaslist(carwaslist);
        return carwaslist;
    }
    //    修改
    @PutMapping("/updateAllCarwaslist")
    public Carwaslist updateAllCarwaslist(@RequestBody Carwaslist carwaslist){
        carwaslistService.updateAllCarwaslist(carwaslist);
        return carwaslist;
    }
    //    修改状态
    @PutMapping("/updateCarwaslistSta")
    public Carwaslist updateCarwaslistSta(@RequestBody Carwaslist carwaslist){
        carwaslistService.updateCarwaslistSta(carwaslist);
        return carwaslist;
    }
}
