package com.trkj.asms.controller;

import com.trkj.asms.entity.Color;
import com.trkj.asms.service.ColorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车身颜色表(Color)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:41:12
 */
@RestController
@RequestMapping("color")
public class ColorController {
    /**
     * 服务对象
     */
    @Resource
    private ColorService colorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Color selectOne(Integer id) {
        return this.colorService.queryById(id);
    }

    /**
     * 查询所有车身颜色
     * @return
     */
    @GetMapping("findall")
    public List<Color> findall(){
        return this.colorService.findall();
    }

}
