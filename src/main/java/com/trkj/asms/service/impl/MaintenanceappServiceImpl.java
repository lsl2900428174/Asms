package com.trkj.asms.service.impl;

import com.trkj.asms.dao.MaintenanceappDao;
import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MaintenanceappService;
import com.trkj.asms.vo.MaintenanceappVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@Slf4j
public class MaintenanceappServiceImpl implements MaintenanceappService {
    @Resource
    private MaintenanceappDao maintenanceappDao;
    @Override
    public List<MaintenanceappVo> selectmaintenanceapp(String c_name) {
        log.debug("模糊查询客户姓名显示");
        return maintenanceappDao.selectmaintenanceapp(c_name);
    }

    @Override
    public Maintenanceapp insert(Maintenanceapp maintenanceapp) {
        maintenanceappDao.insert(maintenanceapp);
        return maintenanceapp;
    }
}
