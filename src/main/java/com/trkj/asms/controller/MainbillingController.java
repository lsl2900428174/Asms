package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;
import com.trkj.asms.vo.MainbillingVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维修开单表(Mainbilling)表控制层
 *
 * @author makejava
 * @since 2021-07-11 23:53:59
 */
@RestController
@RequestMapping("mainbilling")
@Slf4j
public class MainbillingController {
    /**
     * 服务对象
     */
    @Resource
    private MainbillingService mainbillingService;
//模糊查询显示
    @GetMapping("/queryAllByLimit")
    public PageInfo<MainbillingVo> selectRegisterSource(@RequestParam("c_name") String c_name, @RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        log.debug("Controller 查询方法调用");
        PageHelper.startPage(currentPage,pagesize);
        List<MainbillingVo> findSourcePage = mainbillingService.queryAllByLimit(c_name);
        PageInfo<MainbillingVo> findSourcePageInfo = new PageInfo<>(findSourcePage);
        return findSourcePageInfo;
    }

}