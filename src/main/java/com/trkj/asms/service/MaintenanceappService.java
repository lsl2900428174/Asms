package com.trkj.asms.service;

import com.trkj.asms.entity.Maintenanceapp;

import java.util.List;

public interface MaintenanceappService {
    List<Maintenanceapp> selectByPrimaryKey();
    Maintenanceapp insertMaintenanceapp(Maintenanceapp maintenanceapp);
    Maintenanceapp updatemaintenanceapp(Maintenanceapp maintenanceapp);
    Maintenanceapp updatemaintenanceappmony(Maintenanceapp maintenanceapp);
}
