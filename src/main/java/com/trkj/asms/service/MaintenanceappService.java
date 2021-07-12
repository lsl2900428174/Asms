package com.trkj.asms.service;

import com.trkj.asms.vo.MaintenanceappVo;

import java.util.List;

public interface MaintenanceappService {
    List<MaintenanceappVo> selectmaintenanceapp(String c_name);
}
