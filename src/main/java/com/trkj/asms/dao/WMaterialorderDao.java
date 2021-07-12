package com.trkj.asms.dao;

import com.trkj.asms.entity.WMaterialorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物资采购订单表和库存表(WMaterialorder)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 20:23:17
 */
@Mapper
public interface WMaterialorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param moId 主键
     * @return 实例对象
     */
    WMaterialorder queryById(Integer moId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WMaterialorder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wMaterialorder 实例对象
     * @return 对象列表
     */
    List<WMaterialorder> queryAll(WMaterialorder wMaterialorder);

    /**
     * 新增数据
     *
     * @param wMaterialorder 实例对象
     * @return 影响行数
     */
    int insert(WMaterialorder wMaterialorder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WMaterialorder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WMaterialorder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WMaterialorder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<WMaterialorder> entities);

    /**
     * 修改数据
     *
     * @param wMaterialorder 实例对象
     * @return 影响行数
     */
    int update(WMaterialorder wMaterialorder);

    /**
     * 通过主键删除数据
     *
     * @param moId 主键
     * @return 影响行数
     */
    int deleteById(Integer moId);

}

