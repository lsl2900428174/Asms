package com.trkj.asms.dao;

import com.trkj.asms.entity.Mainbilling;

public interface MainbillingDao {
    int deleteByPrimaryKey(Integer mainbillingid);

    int insert(Mainbilling record);

    int insertSelective(Mainbilling record);

    Mainbilling selectByPrimaryKey(Integer mainbillingid);

    int updateByPrimaryKeySelective(Mainbilling record);

    int updateByPrimaryKey(Mainbilling record);
}