package com.trkj.asms.dao;

import com.trkj.asms.entity.Pendingpayment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 待付列表(Pendingpayment)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 07:46:46
 */
public interface PendingpaymentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Pendingpayment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Pendingpayment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pendingpayment 实例对象
     * @return 对象列表
     */
    List<Pendingpayment> queryAll(Pendingpayment pendingpayment);

    /**
     * 新增数据
     *
     * @param pendingpayment 实例对象
     * @return 影响行数
     */
    int insert(Pendingpayment pendingpayment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Pendingpayment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Pendingpayment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Pendingpayment> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Pendingpayment> entities);

    /**
     * 修改数据
     *
     * @param pendingpayment 实例对象
     * @return 影响行数
     */
    int update(Pendingpayment pendingpayment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

