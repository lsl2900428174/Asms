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
    List<WxmxhzVo> wxmxhz(int currentPage, int pageSize);
    List<WzcghzoVo> wzcghz(int currentPage, int pageSize);
    List<WzxshzVo> wzxshz(int currentPage, int pageSize);
    List<ZjyeVo> zjye();
    List<DzmxVo> xfjefx();
    List<DzmxVo> jzlx();
    List<DzmxVo> jzlx1();
    List<WxmxhzVo> flcx(WxmxhzVo wxmxhzVo);
    List<DzmxVo> selectnumber(String settlementtype);
    /**
     * 查询给定的俩个时间节点之间的单据
     */
    List<WxmxhzVo> sjcx(String date1, String date2);
}