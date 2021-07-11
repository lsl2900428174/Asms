package com.trkj.asms.dao;

import com.trkj.asms.entity.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 门店表(Store)表数据库访问层
 *
 * @author lishilong
 * @since 2021-07-11 11:48:06
 */
@Mapper
public interface StoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    Store queryById(Integer sId);

    /**
     * 查询所有门店数据
     * @return
     */
    List<Store> selectAll();

    /**
     * 根据门店名称模糊查询
     * @param name
     * @return
     */
    List<Store> selectLikeByName(String name);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Store> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param store 实例对象
     * @return 对象列表
     */
    List<Store> queryAll(Store store);

    /**
     * 新增门店数据
     *
     * @param store 实例对象
     * @return 影响行数
     */
    int insert(Store store);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Store> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Store> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Store> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Store> entities);

    /**
     * 修改数据
     *
     * @param store 实例对象
     * @return 影响行数
     */
    int update(Store store);

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 影响行数
     */
    int deleteById(Integer sId);

}

