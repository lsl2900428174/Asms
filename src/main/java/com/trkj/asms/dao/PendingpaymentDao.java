package com.trkj.asms.dao;

import com.trkj.asms.entity.Pendingpayment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PendingpaymentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Pendingpayment record);

    int insertSelective(Pendingpayment record);

    Pendingpayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pendingpayment record);

    int updateByPrimaryKey(Pendingpayment record);
//查询所以：客户
    List<Pendingpayment> selectAll();
}