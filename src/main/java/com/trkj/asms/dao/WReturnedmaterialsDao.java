package com.trkj.asms.dao;

import com.trkj.asms.entity.WReturnedmaterials;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 退货物资(WReturnedmaterials)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 09:19:37
 */
@Mapper
public interface WReturnedmaterialsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    WReturnedmaterials queryById(Integer rId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WReturnedmaterials> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param wReturnedmaterials 实例对象
     * @return 对象列表
     */
    List<WReturnedmaterials> queryAll(WReturnedmaterials wReturnedmaterials);

    /**
     * 新增数据
     *
     * @param wReturnedmaterials 实例对象
     * @return 影响行数
     */
    int insert(WReturnedmaterials wReturnedmaterials);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WReturnedmaterials> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WReturnedmaterials> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WReturnedmaterials> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<WReturnedmaterials> entities);

    /**
     * 修改数据
     *
     * @param wReturnedmaterials 实例对象
     * @return 影响行数
     */
    int update(WReturnedmaterials wReturnedmaterials);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 影响行数
     */
    int deleteById(Integer rId);

    /**
     * 通过编号查询所有
     *
     * @return 影响行数
     */
    List<WReturnedmaterials> queryByCodeAll(String billcode);
}

