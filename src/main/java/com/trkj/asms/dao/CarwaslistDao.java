package com.trkj.asms.dao;

import com.trkj.asms.entity.Carwaslist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CarwaslistDao {
//    模糊查询
    List<Carwaslist> selectAllCarwashlike(String name);

    int deleteByPrimaryKey(Integer carid);
//增加
    int insertCarwaslist(Carwaslist record);
//修改
    int updateAllCarwaslist(Carwaslist record);
//改状态
    int updateCarwaslistSta(Carwaslist record);

    int insertSelective(Carwaslist record);

    Carwaslist selectByPrimaryKey(Integer carid);


    int updateByPrimaryKey(Carwaslist record);
}