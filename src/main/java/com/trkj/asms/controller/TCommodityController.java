package com.trkj.asms.controller;

import com.trkj.asms.entity.TCommodity;
import com.trkj.asms.service.TCommodityService;
import com.trkj.asms.vo.AjaxResponse;
import com.trkj.asms.vo.wzVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物资商品表(TCommodity)表控制层
 *
 * @author makejava
 * @since 2021-07-11 20:53:47
 */
@RestController
@RequestMapping("tCommodity")
public class TCommodityController {
    /**
     * 服务对象
     */
    @Resource
    private TCommodityService tCommodityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TCommodity selectOne(Integer id) {
        return this.tCommodityService.queryById(id);
    }

    /**
     * 材料领料汇总
     * @return
     */
    @GetMapping("cllyhz")
    public AjaxResponse selectcx(){
        List<wzVo> list =this.tCommodityService.cllyhz();
        System.out.println("list:"+list);
        return AjaxResponse.success(list);

    }
}
