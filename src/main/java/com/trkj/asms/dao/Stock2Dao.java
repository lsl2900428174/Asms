package com.trkj.asms.dao;

import com.trkj.asms.entity.Stock2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Stock2)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 21:31:03
 */
@Mapper
public interface Stock2Dao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Stock2 queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<Stock2> selectAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param stock2 实例对象
     * @return 对象列表
     */
    List<Stock2> queryAll(Stock2 stock2);

    /**
     * 新增数据
     *
     * @param stock2 实例对象
     * @return 影响行数
     */
    int insert(Stock2 stock2);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stock2> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Stock2> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stock2> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Stock2> entities);

    /**
     * 修改数据
     *
     * @param stock2 实例对象
     * @return 影响行数
     */
    int update(Stock2 stock2);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

