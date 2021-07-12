package com.trkj.asms.dao;

import com.trkj.asms.entity.WPickingoutorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 维修领料出库单(WPickingoutorder)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 13:29:18
 */
public interface WPickingoutorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param poId 主键
     * @return 实例对象
     */
    WPickingoutorder queryById(Integer poId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WPickingoutorder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wPickingoutorder 实例对象
     * @return 对象列表
     */
    List<WPickingoutorder> queryAll(WPickingoutorder wPickingoutorder);

    /**
     * 新增数据
     *
     * @param wPickingoutorder 实例对象
     * @return 影响行数
     */
    int insert(WPickingoutorder wPickingoutorder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WPickingoutorder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WPickingoutorder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WPickingoutorder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<WPickingoutorder> entities);

    /**
     * 修改数据
     *
     * @param wPickingoutorder 实例对象
     * @return 影响行数
     */
    int update(WPickingoutorder wPickingoutorder);

    /**
     * 通过主键删除数据
     *
     * @param poId 主键
     * @return 影响行数
     */
    int deleteById(Integer poId);

}

