package com.trkj.asms.dao;

import com.trkj.asms.entity.TCommodity;
import com.trkj.asms.vo.wzVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 物资商品表(TCommodity)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 20:53:46
 */
@Mapper
public interface TCommodityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param coId 主键
     * @return 实例对象
     */
    TCommodity queryById(Integer coId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TCommodity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tCommodity 实例对象
     * @return 对象列表
     */
    List<TCommodity> queryAll(TCommodity tCommodity);

    /**
     * 新增数据
     *
     * @param tCommodity 实例对象
     * @return 影响行数
     */
    int insert(TCommodity tCommodity);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TCommodity> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TCommodity> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TCommodity> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TCommodity> entities);

    /**
     * 修改数据
     *
     * @param tCommodity 实例对象
     * @return 影响行数
     */
    int update(TCommodity tCommodity);

    /**
     * 通过主键删除数据
     *
     * @param coId 主键
     * @return 影响行数
     */
    int deleteById(Integer coId);

    List<wzVo> cllyhz();

}

