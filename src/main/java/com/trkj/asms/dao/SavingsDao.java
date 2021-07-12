package com.trkj.asms.dao;

import com.trkj.asms.entity.Savings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Savings)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 02:41:58
 */
@Mapper
public interface SavingsDao {
    /**
     * 根据储值卡号增加余额
     * @param symony
     * @param savingsno
     * @return
     */
    int updatemoney(@Param("symony") double symony,@Param("savingsno") String savingsno);

    /**
     * 根据储值卡号查询是否存在当前储值卡
     * @param savingsno
     * @return
     */
    int findbynumber(String savingsno);

    /**
     * 通过ID查询单条数据
     *
     * @param savingsid 主键
     * @return 实例对象
     */
    Savings queryById(Integer savingsid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Savings> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param savings 实例对象
     * @return 对象列表
     */
    List<Savings> queryAll(Savings savings);

    /**
     * 新增数据
     *
     * @param savings 实例对象
     * @return 影响行数
     */
    int insert(Savings savings);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Savings> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Savings> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Savings> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Savings> entities);

    /**
     * 修改数据
     *
     * @param savings 实例对象
     * @return 影响行数
     */
    int update(Savings savings);

    /**
     * 通过主键删除数据
     *
     * @param savingsid 主键
     * @return 影响行数
     */
    int deleteById(Integer savingsid);

}

