package com.trkj.asms.service.impl;

import com.trkj.asms.dao.MaintenanceappDao;
import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MaintenanceappService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Slf4j
@Service
public class MaintenanceappServiceImpl implements MaintenanceappService {
    @Resource
    private MaintenanceappDao maintenanceappDao;
    @Override
    public List<Maintenanceapp> selectByPrimaryKey() {
        return maintenanceappDao.selectByPrimaryKey();
    }
}
