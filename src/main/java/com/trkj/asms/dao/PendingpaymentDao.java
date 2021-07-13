package com.trkj.asms.dao;

import com.trkj.asms.entity.Pendingpayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PendingpaymentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Pendingpayment record);

    int insertSelective(Pendingpayment record);

    Pendingpayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pendingpayment record);

    int updateByPrimaryKey(Pendingpayment record);
    //待付款：查询所以：客户
    List<Pendingpayment> selectAll();
//    付款单
    List<Pendingpayment> selectyiAll();
//    模糊查询
    List<Pendingpayment> selectmohu(@Param("documentnumber") String documentnumber,@Param("s_name") String s_name);

    List<Pendingpayment> selectyimohu(@Param("documentnumber") String documentnumber,@Param("documenttype") String documenttype);

}