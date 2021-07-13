package com.trkj.asms.service;

import com.trkj.asms.entity.Projectsettings;
import java.util.List;

/**
 * 项目设置表(Projectsettings)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 09:41:09
 */
public interface ProjectsettingsService {

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    Projectsettings queryById(Integer pId);

//    下拉接口
    List<Projectsettings> selectProjectsettings();
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Projectsettings> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param projectsettings 实例对象
     * @return 实例对象
     */
    Projectsettings insert(Projectsettings projectsettings);

    /**
     * 修改数据
     *
     * @param projectsettings 实例对象
     * @return 实例对象
     */
    Projectsettings update(Projectsettings projectsettings);

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pId);

}