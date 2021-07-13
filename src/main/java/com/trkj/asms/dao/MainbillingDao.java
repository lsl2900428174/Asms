package com.trkj.asms.dao;

import com.trkj.asms.entity.Mainbilling;

import com.trkj.asms.vo.*;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MainbillingDao {

    List<Mainbilling> selectMainbilling();
    int insertMainbilling(Mainbilling record);
    int updateMainbilling(Mainbilling record);


    /**
     * 通过ID查询单条数据
     *
     * @param mainbillingid 主键
     * @return 实例对象
     */
    Mainbilling queryById(Integer mainbillingid);



    /**
     * 通过实体作为筛选条件查询
     *
     * @param mainbilling 实例对象
     * @return 对象列表
     */
    List<Mainbilling> queryAll(Mainbilling mainbilling);

    /**
     * 新增数据
     *
     * @param mainbilling 实例对象
     * @return 影响行数
     */
    int insert(Mainbilling mainbilling);

    /**
     * 修改数据
     *
     * @param mainbilling 实例对象
     * @return 影响行数
     */
    int update(Mainbilling mainbilling);

    /**
     * 通过主键删除数据
     *
     * @param mainbillingid 主键
     * @return 影响行数
     */
    int deleteById(Integer mainbillingid);
    List<WxmxhzVo> wxmxhz();
    List<WzcghzoVo> wzcghz();
    List<WzxshzVo> wzxshz();
    List<ZjyeVo> zjye();
    List<DzmxVo> selectnumber(String settlementtype);
}