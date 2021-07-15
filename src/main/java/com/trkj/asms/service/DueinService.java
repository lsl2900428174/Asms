package com.trkj.asms.service;

import com.trkj.asms.entity.Duein;

import java.util.List;

public interface DueinService {
    //待收款
    List<Duein> findduein();
//    收款单
    List<Duein> findyiduein();
    Duein adddueinAll(Duein duein);
//    删除：改变时效性1
Duein deleteduein(Duein record);
//模糊查询
List<Duein> finddueinmohu(String documentnumber ,String s_name,String documenttype);

}
