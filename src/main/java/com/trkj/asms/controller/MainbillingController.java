package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;
import com.trkj.asms.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @GetMapping("wxmxhz")
    public AjaxResponse selectcx(){
        List<WxmxhzVo> list =this.mainbillingService.wxmxhz();
        System.out.println("list:"+list);
        return AjaxResponse.success(list);

    }
    @GetMapping("wzcghz")
    public AjaxResponse selectcx1(){
        List<WzcghzoVo> list =this.mainbillingService.wzcghz();
        System.out.println("list1:"+list);
        return AjaxResponse.success(list);

    }
    @GetMapping("wzxshz")
    public AjaxResponse selectcx2(){
        List<WzxshzVo> list =this.mainbillingService.wzxshz();
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);

    }
    @GetMapping("zjye")
    public AjaxResponse selectcx3(){
        List<ZjyeVo> list =this.mainbillingService.zjye();
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);

    }
    //根据单据号查询
    @GetMapping("selectnumber")
    public AjaxResponse selectnumber(String settlementtype){
        System.out.println(",,,"+settlementtype);
        Map<String,Object> map=new HashMap<>();
        List<DzmxVo> list= this.mainbillingService.selectnumber(settlementtype);
        System.out.println("selectnumber:list:"+list);
        map.put("rows",list);
        return AjaxResponse.success(map);
    }

}