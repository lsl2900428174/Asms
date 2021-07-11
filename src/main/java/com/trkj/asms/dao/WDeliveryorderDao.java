package com.trkj.asms.dao;

import com.trkj.asms.entity.WDeliveryorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物资采购退货出库单(WDeliveryorder)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 10:59:30
 */
@Mapper
public interface WDeliveryorderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param doId 主键
     * @return 实例对象
     */
    WDeliveryorder queryById(Integer doId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WDeliveryorder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wDeliveryorder 实例对象
     * @return 对象列表
     */
    List<WDeliveryorder> queryAll(WDeliveryorder wDeliveryorder);

    /**
     * 新增数据
     *
     * @param wDeliveryorder 实例对象
     * @return 影响行数
     */
    int insert(WDeliveryorder wDeliveryorder);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WDeliveryorder> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WDeliveryorder> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WDeliveryorder> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<WDeliveryorder> entities);

    /**
     * 修改数据
     *
     * @param wDeliveryorder 实例对象
     * @return 影响行数
     */
    int update(WDeliveryorder wDeliveryorder);

    /**
     * 通过主键删除数据
     *
     * @param doId 主键
     * @return 影响行数
     */
    int deleteById(Integer doId);

}

