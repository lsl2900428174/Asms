package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.dao.MaintenanceappDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MaintenanceappService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Slf4j
@Service
public class MaintenanceappServiceImpl implements MaintenanceappService {
    @Resource
    private MaintenanceappDao maintenanceappDao;
    @Resource
    private DueinDao dueinDao;
    @Override
    public List<Maintenanceapp> selectByPrimaryKey() {
        return maintenanceappDao.selectByPrimaryKey();
    }

    @Override
    public Maintenanceapp insertMaintenanceapp(Maintenanceapp maintenanceapp) {
        //我要获取当前的日期
        Date date = new Date();
        //设置要获取到什么样的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        //获取String类型的时间
        String createdate = sdf.format(date);
        maintenanceapp.setAppno("CYYS"+createdate+maintenanceapp.getKehuid()+1);
        maintenanceappDao.insertMaintenanceapp(maintenanceapp);
        return maintenanceapp;
    }

    @Override
    public Maintenanceapp updatemaintenanceapp(Maintenanceapp maintenanceapp) {
        maintenanceappDao.updatemaintenanceapp(maintenanceapp);
        return maintenanceapp;
    }

    @Override
    public Maintenanceapp updatemaintenanceappmony(Maintenanceapp maintenanceapp){
        maintenanceappDao.updatemaintenanceappmony(maintenanceapp);
        //添加收款单
       maintenanceapp= maintenanceappDao.selectByPrimaryKeyId(maintenanceapp.getMaintenanceappid());
        Duein duein=new Duein();
        duein.setCustomerid(maintenanceapp.getKehuid());
        duein.setDocumentdate(new Date());
        duein.setDocumentstatus(1);//已结算
        duein.setDocumentnumber(maintenanceapp.getAppno());//预约单号
        duein.setDocumenttype("维修美容单");
        duein.setRelationship("客户");
        duein.setOrderamount(maintenanceapp.getYujiallmony());
        duein.setSId(maintenanceapp.getMendianid());
        duein.setCarmagid(maintenanceapp.getCarmanagement().getChepai());
        dueinDao.insertSelective(duein);
        return maintenanceapp;
    }

    @Override
    public Maintenanceapp updateAllapp(Maintenanceapp maintenanceapp) {
//        maintenanceapp.setCailiaoid(maintenanceapp.getCommodity().getCoId());
//        maintenanceapp.set
        maintenanceappDao.updateAllapp(maintenanceapp);
        return maintenanceapp;

    }
}
