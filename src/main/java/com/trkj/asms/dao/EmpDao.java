package com.trkj.asms.dao;

import com.trkj.asms.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 员工表(Emp)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 21:06:39
 */
@Mapper
public interface EmpDao {
    /**
     * 查看所有员工（服务顾问或者销售顾问）
     * @return
     */
    List<Emp> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param eId 主键
     * @return 实例对象
     */
    Emp queryById(Integer eId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Emp> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param emp 实例对象
     * @return 对象列表
     */
    List<Emp> queryAll(Emp emp);

    /**
     * 新增数据
     *
     * @param emp 实例对象
     * @return 影响行数
     */
    int insert(Emp emp);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Emp> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Emp> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Emp> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Emp> entities);

    /**
     * 修改数据
     *
     * @param emp 实例对象
     * @return 影响行数
     */
    int update(Emp emp);

    /**
     * 通过主键删除数据
     *
     * @param eId 主键
     * @return 影响行数
     */
    int deleteById(Integer eId);

}

