package com.trkj.asms.dao;

import com.trkj.asms.entity.Duein;

import java.util.List;

public interface DueinDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Duein record);

    int insertSelective(Duein record);

    Duein selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Duein record);

    int updateByPrimaryKey(Duein record);
//    查询：
    List<Duein> findduein();
}