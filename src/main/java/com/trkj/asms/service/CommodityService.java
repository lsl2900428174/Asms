package com.trkj.asms.service;

import com.trkj.asms.entity.Commodity;

import java.util.List;

public interface CommodityService {
    //下拉接口
    List<Commodity> selectBycommodity();
}
