package com.trkj.asms.dao;

import com.trkj.asms.entity.Refundorder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RefundorderDao {
    int deleteByPrimaryKey(Integer rId);

    int insert(Refundorder record);

    int insertSelective(Refundorder record);

    List<Refundorder> selectByPrimaryKey();

    int updateByPrimaryKeySelective(Refundorder record);

    int updateByPrimaryKey(Refundorder record);
}