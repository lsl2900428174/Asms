package com.trkj.asms.dao;

import com.trkj.asms.entity.Carwaslist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Carwaslist)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 10:55:49
 */
@Mapper
public interface CarwaslistDao {

    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    Carwaslist queryById(Integer carid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Carwaslist> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carwaslist 实例对象
     * @return 对象列表
     */
    List<Carwaslist> queryAll(Carwaslist carwaslist);

    /**
     * 新增数据
     *
     * @param carwaslist 实例对象
     * @return 影响行数
     */
    int insert(Carwaslist carwaslist);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Carwaslist> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Carwaslist> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Carwaslist> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Carwaslist> entities);

    /**
     * 修改数据
     *
     * @param carwaslist 实例对象
     * @return 影响行数
     */
    int update(Carwaslist carwaslist);

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 影响行数
     */
    int deleteById(Integer carid);

}

