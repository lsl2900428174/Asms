package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.service.MaintenanceappService;
import com.trkj.asms.vo.MaintenanceappVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class MaintenanceappController {
    @Autowired
    private MaintenanceappService maintenanceappService;
    //    模糊查询显示
    @GetMapping("/selectmaintenanceapp")
    public PageInfo<MaintenanceappVo> selectmaintenanceapp(@RequestParam("c_name") String c_name,@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        log.debug("Controller 方法调用");
        List<MaintenanceappVo> maintenPage = maintenanceappService.selectmaintenanceapp(c_name);
        PageInfo<MaintenanceappVo> maintenPageInfo = new PageInfo<>(maintenPage);
        return maintenPageInfo;
    }
}
