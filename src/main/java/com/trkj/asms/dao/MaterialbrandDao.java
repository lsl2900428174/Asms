package com.trkj.asms.dao;

import com.trkj.asms.entity.Materialbrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物资品牌表(Materialbrand)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 20:02:06
 */
@Mapper
public interface MaterialbrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    Materialbrand queryById(Integer mId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Materialbrand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param materialbrand 实例对象
     * @return 对象列表
     */
    List<Materialbrand> queryAll(Materialbrand materialbrand);

    /**
     * 新增数据
     *
     * @param materialbrand 实例对象
     * @return 影响行数
     */
    int insert(Materialbrand materialbrand);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Materialbrand> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Materialbrand> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Materialbrand> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Materialbrand> entities);

    /**
     * 修改数据
     *
     * @param materialbrand 实例对象
     * @return 影响行数
     */
    int update(Materialbrand materialbrand);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 影响行数
     */
    int deleteById(Integer mId);

}

