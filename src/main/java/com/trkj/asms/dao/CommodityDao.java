package com.trkj.asms.dao;

import com.trkj.asms.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommodityDao {

//下拉接口
    List<Commodity> selectBycommodity();

}