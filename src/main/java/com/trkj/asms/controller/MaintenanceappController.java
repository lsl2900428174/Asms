package com.trkj.asms.controller;

import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MaintenanceappService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class MaintenanceappController {
    @Resource
    private MaintenanceappService maintenanceappService;
    @GetMapping("/selectByPrimaryKey")
    public List<Maintenanceapp> selectByPrimaryKey(){
        List<Maintenanceapp> entityPage =maintenanceappService.selectByPrimaryKey();
        return entityPage;
    }
    //    增加
    @PostMapping("/insertMaintenanceapp")
    public Maintenanceapp addRegister(@RequestBody Maintenanceapp maintenanceapp){
        System.out.println("==================="+maintenanceapp);
        maintenanceappService.insertMaintenanceapp(maintenanceapp);
        return maintenanceapp;
    }
//    改状态
    @PutMapping("/updatemaintenanceapp")
    public Maintenanceapp updatemaintenanceapp(@RequestBody Maintenanceapp maintenanceapp){
        maintenanceappService.updatemaintenanceapp(maintenanceapp);
        return maintenanceapp;
    }
    //    改状态
    @PutMapping("/updatemaintenanceappmony")
    public Maintenanceapp updatemaintenanceappmony(@RequestBody Maintenanceapp maintenanceapp){
        maintenanceappService.updatemaintenanceappmony(maintenanceapp);
        return maintenanceapp;
    }
}
