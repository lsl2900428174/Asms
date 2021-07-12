package com.trkj.asms.controller;

import com.trkj.asms.entity.Series;
import com.trkj.asms.service.SeriesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆车系表(Series)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:39:27
 */
@RestController
@RequestMapping("series")
public class SeriesController {
    /**
     * 服务对象
     */
    @Resource
    private SeriesService seriesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Series selectOne(Integer id) {
        return this.seriesService.queryById(id);
    }

    /**
     * 查询所有车系
     * @return
     */
    @GetMapping("findall")
    public List<Series> findall(){
        return this.seriesService.findall();
    }

}
