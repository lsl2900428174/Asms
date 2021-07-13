package com.trkj.asms.service;

import com.trkj.asms.entity.Carwaslist;

import java.util.List;

public interface CarwaslistService {
    //    模糊查询
    List<Carwaslist> selectAllCarwashlike(String name);
//    增加
    Carwaslist insertCarwaslist(Carwaslist carwaslist);
//    修改
    Carwaslist updateAllCarwaslist(Carwaslist carwaslist);
//    改状态
    Carwaslist updateCarwaslistSta(Carwaslist carwaslist);
}
