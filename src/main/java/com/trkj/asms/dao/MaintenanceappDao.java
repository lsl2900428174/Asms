package com.trkj.asms.dao;

import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.vo.MaintenanceappVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MaintenanceappDao {
    int deleteByPrimaryKey(Integer maintenanceappid);

    int insert(Maintenanceapp record);

    int insertSelective(Maintenanceapp record);
//查询显示
    List<MaintenanceappVo> selectmaintenanceapp(String c_name);

    int updateByPrimaryKeySelective(Maintenanceapp record);

    int updateByPrimaryKey(Maintenanceapp record);
}