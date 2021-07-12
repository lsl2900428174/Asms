package com.trkj.asms.controller;

import com.trkj.asms.entity.Interiorcolor;
import com.trkj.asms.service.InteriorcolorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 内饰颜色表(Interiorcolor)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:40:41
 */
@RestController
@RequestMapping("interiorcolor")
public class InteriorcolorController {
    /**
     * 服务对象
     */
    @Resource
    private InteriorcolorService interiorcolorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Interiorcolor selectOne(Integer id) {
        return this.interiorcolorService.queryById(id);
    }

    /**
     * 查询所有内饰颜色
     * @return
     */
    @GetMapping("findall")
    public List<Interiorcolor> findall(){
        return this.interiorcolorService.findall();
    }

}
