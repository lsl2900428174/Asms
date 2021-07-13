package com.trkj.asms.dao;

import com.trkj.asms.entity.Mainbilling;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MainbillingDao {
    List<Mainbilling> selectMainbilling();
    int insertMainbilling(Mainbilling record);
    int updateMainbilling(Mainbilling record);
}