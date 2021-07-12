package com.trkj.asms.dao;

import com.trkj.asms.entity.Series;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 车辆车系表(Series)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 21:39:27
 */
@Mapper
public interface SeriesDao {
    List<Series> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param vsId 主键
     * @return 实例对象
     */
    Series queryById(Integer vsId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Series> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param series 实例对象
     * @return 对象列表
     */
    List<Series> queryAll(Series series);

    /**
     * 新增数据
     *
     * @param series 实例对象
     * @return 影响行数
     */
    int insert(Series series);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Series> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Series> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Series> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Series> entities);

    /**
     * 修改数据
     *
     * @param series 实例对象
     * @return 影响行数
     */
    int update(Series series);

    /**
     * 通过主键删除数据
     *
     * @param vsId 主键
     * @return 影响行数
     */
    int deleteById(Integer vsId);

}

