package com.trkj.asms.dao;

import com.trkj.asms.entity.Vehicletype;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 车辆类型表(Vehicletype)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 21:40:06
 */
@Mapper
public interface VehicletypeDao {
    List<Vehicletype> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param vId 主键
     * @return 实例对象
     */
    Vehicletype queryById(Integer vId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Vehicletype> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param vehicletype 实例对象
     * @return 对象列表
     */
    List<Vehicletype> queryAll(Vehicletype vehicletype);

    /**
     * 新增数据
     *
     * @param vehicletype 实例对象
     * @return 影响行数
     */
    int insert(Vehicletype vehicletype);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Vehicletype> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Vehicletype> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Vehicletype> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Vehicletype> entities);

    /**
     * 修改数据
     *
     * @param vehicletype 实例对象
     * @return 影响行数
     */
    int update(Vehicletype vehicletype);

    /**
     * 通过主键删除数据
     *
     * @param vId 主键
     * @return 影响行数
     */
    int deleteById(Integer vId);

}

