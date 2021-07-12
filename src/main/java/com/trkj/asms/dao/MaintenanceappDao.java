package com.trkj.asms.dao;

import com.trkj.asms.entity.Maintenanceapp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MaintenanceappDao {

    List<Maintenanceapp> selectByPrimaryKey();

}