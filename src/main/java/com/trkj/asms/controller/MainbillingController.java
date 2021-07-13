package com.trkj.asms.controller;

import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MainbillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MainbillingController {
    @Autowired
    private MainbillingService mainbillingService;
    @GetMapping("/selectMainbilling")
    public List<Mainbilling> selectMainbilling(){
        List<Mainbilling> findSourcePage = mainbillingService.selectMainbilling();
        return findSourcePage;
    }
    //    增加
    @PostMapping("/insertMainbilling")
    public Mainbilling insertMainbilling(@RequestBody Mainbilling mainbilling){
        mainbillingService.insertMainbilling(mainbilling);
        return mainbilling;
    }
//    改状态
    @PutMapping("/updateMainbilling")
    public Mainbilling updateMainbilling(@RequestBody Mainbilling mainbilling){
        mainbillingService.updateMainbilling(mainbilling);
        return mainbilling;
    }
}
