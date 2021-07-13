package com.trkj.asms.dao;

import com.trkj.asms.entity.Maintenanceapp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MaintenanceappDao {
//显示
    List<Maintenanceapp> selectByPrimaryKey();
//增加
    int insertMaintenanceapp(Maintenanceapp record);
//    修改状态
    int updatemaintenanceapp(Maintenanceapp record);
    //    修改状态
    int updatemaintenanceappmony(Maintenanceapp record);
//    修改
    int updateAllapp(Maintenanceapp record);
}