package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Projectsettings;
import com.trkj.asms.dao.ProjectsettingsDao;
import com.trkj.asms.service.ProjectsettingsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目设置表(Projectsettings)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 09:41:09
 */
@Service("projectsettingsService")
public class ProjectsettingsServiceImpl implements ProjectsettingsService {
    @Resource
    private ProjectsettingsDao projectsettingsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pId 主键
     * @return 实例对象
     */
    @Override
    public Projectsettings queryById(Integer pId) {
        return this.projectsettingsDao.queryById(pId);
    }

//    下拉接口
    @Override
    public List<Projectsettings> selectProjectsettings() {
        return projectsettingsDao.selectProjectsettings();
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Projectsettings> queryAllByLimit(int offset, int limit) {
        return this.projectsettingsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param projectsettings 实例对象
     * @return 实例对象
     */
    @Override
    public Projectsettings insert(Projectsettings projectsettings) {
        this.projectsettingsDao.insert(projectsettings);
        return projectsettings;
    }

    /**
     * 修改数据
     *
     * @param projectsettings 实例对象
     * @return 实例对象
     */
    @Override
    public Projectsettings update(Projectsettings projectsettings) {
        this.projectsettingsDao.update(projectsettings);
        return this.queryById(projectsettings.getPId());
    }

    /**
     * 通过主键删除数据
     *
     * @param pId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pId) {
        return this.projectsettingsDao.deleteById(pId) > 0;
    }
}