package com.trkj.asms.dao;

import com.trkj.asms.entity.Store;

import java.util.List;

public interface StoreDao {
    //查询所有的门店信息
    public List<Store> findStoreAll();
}
