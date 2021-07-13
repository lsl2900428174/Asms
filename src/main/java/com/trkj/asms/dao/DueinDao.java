package com.trkj.asms.dao;

import com.trkj.asms.entity.Duein;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DueinDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Duein record);

    int insertSelective(Duein record);

    Duein selectByPrimaryKey(Integer id);
//删除：改变时效性未1
    int updateByPrimaryKeySelective(Duein record);

    int updateByPrimaryKey(Duein record);
//    查询：收款列表
    List<Duein> findduein();
//    收款单
    List<Duein> findyiduein();
}