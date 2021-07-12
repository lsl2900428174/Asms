package com.trkj.asms.controller;

import com.trkj.asms.entity.Projectsettings;
import com.trkj.asms.service.ProjectsettingsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目设置表(Projectsettings)表控制层
 *
 * @author makejava
 * @since 2021-07-12 09:41:09
 */
@RestController
@RequestMapping("projectsettings")
public class ProjectsettingsController {
    /**
     * 服务对象
     */
    @Resource
    private ProjectsettingsService projectsettingsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Projectsettings selectOne(Integer id) {
        return this.projectsettingsService.queryById(id);
    }

}