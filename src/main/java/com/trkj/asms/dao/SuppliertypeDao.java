package com.trkj.asms.dao;

import com.trkj.asms.entity.Suppliertype;

public interface SuppliertypeDao {
    int deleteByPrimaryKey(Integer suptypeid);

    int insert(Suppliertype record);

    int insertSelective(Suppliertype record);

    Suppliertype selectByPrimaryKey(Integer suptypeid);

    int updateByPrimaryKeySelective(Suppliertype record);

    int updateByPrimaryKey(Suppliertype record);
}