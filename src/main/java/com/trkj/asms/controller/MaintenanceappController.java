package com.trkj.asms.controller;

import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MaintenanceappService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
