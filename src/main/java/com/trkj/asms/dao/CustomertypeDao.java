package com.trkj.asms.dao;

import com.trkj.asms.entity.Customertype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户类型表(Customertype)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 21:00:42
 */
@Mapper
public interface CustomertypeDao {

    List<Customertype> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param ctId 主键
     * @return 实例对象
     */
    Customertype queryById(Integer ctId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customertype> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customertype 实例对象
     * @return 对象列表
     */
    List<Customertype> queryAll(Customertype customertype);

    /**
     * 新增数据
     *
     * @param customertype 实例对象
     * @return 影响行数
     */
    int insert(Customertype customertype);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Customertype> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Customertype> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Customertype> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Customertype> entities);

    /**
     * 修改数据
     *
     * @param customertype 实例对象
     * @return 影响行数
     */
    int update(Customertype customertype);

    /**
     * 通过主键删除数据
     *
     * @param ctId 主键
     * @return 影响行数
     */
    int deleteById(Integer ctId);

}

