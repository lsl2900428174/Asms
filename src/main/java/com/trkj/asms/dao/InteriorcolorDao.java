package com.trkj.asms.dao;

import com.trkj.asms.entity.Interiorcolor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 内饰颜色表(Interiorcolor)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 21:40:40
 */
@Mapper
public interface InteriorcolorDao {

    List<Interiorcolor> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param iId 主键
     * @return 实例对象
     */
    Interiorcolor queryById(Integer iId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Interiorcolor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param interiorcolor 实例对象
     * @return 对象列表
     */
    List<Interiorcolor> queryAll(Interiorcolor interiorcolor);

    /**
     * 新增数据
     *
     * @param interiorcolor 实例对象
     * @return 影响行数
     */
    int insert(Interiorcolor interiorcolor);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Interiorcolor> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Interiorcolor> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Interiorcolor> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Interiorcolor> entities);

    /**
     * 修改数据
     *
     * @param interiorcolor 实例对象
     * @return 影响行数
     */
    int update(Interiorcolor interiorcolor);

    /**
     * 通过主键删除数据
     *
     * @param iId 主键
     * @return 影响行数
     */
    int deleteById(Integer iId);

}

