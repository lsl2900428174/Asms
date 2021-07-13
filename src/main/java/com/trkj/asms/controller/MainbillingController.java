package com.trkj.asms.controller;

import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.entity.Maintenanceapp;
import com.trkj.asms.service.MainbillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
public class MainbillingController {
    @Autowired
    private MainbillingService mainbillingService;
    //    修改
    @PutMapping("/updateAllMainbilling")
    public Mainbilling updateAllMainbilling(@RequestBody Mainbilling mainbilling){
        mainbillingService.updateAllMainbilling(mainbilling);
        return mainbilling;
    }
    @GetMapping("/selectMainbilling")
    public List<Mainbilling> selectMainbilling(){
        List<Mainbilling> findSourcePage = mainbillingService.selectMainbilling();
        return findSourcePage;
    }
    //    增加
    @PostMapping("/insertMainbilling")
    public Mainbilling insertMainbilling(@RequestBody Mainbilling mainbilling){
        mainbillingService.insertMainbilling(mainbilling);
        return mainbilling;
    }
//    改状态
    @PutMapping("/updateMainbilling")
    public Mainbilling updateMainbilling(@RequestBody Mainbilling mainbilling){
        mainbillingService.updateMainbilling(mainbilling);
        return mainbilling;
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
