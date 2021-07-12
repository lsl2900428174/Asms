package com.trkj.asms.dao;

import com.trkj.asms.entity.Mainbilling;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 维修开单表(Mainbilling)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
public interface MainbillingDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mainbillingid 主键
     * @return 实例对象
     */
    Mainbilling queryById(Integer mainbillingid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Mainbilling> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


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

}