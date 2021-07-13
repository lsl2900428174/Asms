package com.trkj.asms.dao;

import com.trkj.asms.entity.Projectsettings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 项目设置表(Projectsettings)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 09:41:09
 */
@Mapper
public interface ProjectsettingsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    Projectsettings queryById(Integer pId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectsettings> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);
//下拉接口
    List<Projectsettings> selectProjectsettings();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param projectsettings 实例对象
     * @return 对象列表
     */
    List<Projectsettings> queryAll(Projectsettings projectsettings);

    /**
     * 新增数据
     *
     * @param projectsettings 实例对象
     * @return 影响行数
     */
    int insert(Projectsettings projectsettings);

    /**
     * 修改数据
     *
     * @param projectsettings 实例对象
     * @return 影响行数
     */
    int update(Projectsettings projectsettings);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 影响行数
     */
    int deleteById(Integer pId);

}