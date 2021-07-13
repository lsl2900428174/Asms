package com.trkj.asms.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
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
    public AjaxResponse selectcx(int currentPage, int pageSize){
        AjaxResponse ajaxResponse =null;
        PageInfo<WxmxhzVo> list =this.mainbillingService.wxmxhz(currentPage,pageSize);
        System.out.println("list:"+list);
        return ajaxResponse.success(list);

    }
    @GetMapping("wzcghz")
    public AjaxResponse selectcx1(int currentPage, int pageSize){
        AjaxResponse ajaxResponse =null;
        PageInfo<WzcghzoVo> list =this.mainbillingService.wzcghz(currentPage,pageSize);
        System.out.println("list1:"+list);
        return ajaxResponse.success(list);

    }
    @GetMapping("wzxshz")
    public AjaxResponse selectcx2(int currentPage, int pageSize){
        PageInfo<WzxshzVo> list =this.mainbillingService.wzxshz(currentPage,pageSize);
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);

    }
    @GetMapping("zjye")
    public AjaxResponse selectcx3(){
        List<ZjyeVo> list =this.mainbillingService.zjye();
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);

    }
    @GetMapping("xfjefx")
    public AjaxResponse selectcx4(){
        List<DzmxVo> list =this.mainbillingService.xfjefx();
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);

    }
    @GetMapping("jzlx")
    public AjaxResponse selectcx5(){
        List<DzmxVo> list =this.mainbillingService.jzlx();
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);
    }
    @GetMapping("jzlx1")
    public AjaxResponse selectcx6(){
        List<DzmxVo> list =this.mainbillingService.jzlx1();
        System.out.println("list2:"+list);
        return AjaxResponse.success(list);
    }
    @GetMapping("selectByname")
    public AjaxResponse selectmh(String input,int currentPage, int pageSize) {
        WxmxhzVo wxmxhzVo=new WxmxhzVo();
        if(input!=null){
            wxmxhzVo.setCName(input);
        }
        AjaxResponse ajaxResponse =null;
        PageInfo<WxmxhzVo> list= this.mainbillingService.flcx(wxmxhzVo,currentPage,pageSize);
        return ajaxResponse.success(list);
    }
    //根据支付方式查询
    @GetMapping("selectnumber")
    public AjaxResponse selectnumber(String settlementtype){
        System.out.println(",,,"+settlementtype);
        Map<String,Object> map=new HashMap<>();
        List<DzmxVo> list= this.mainbillingService.selectnumber(settlementtype);
        System.out.println("selectnumber:list:"+list);
        map.put("rows",list);
        return AjaxResponse.success(map);
    }
    //根据时间查询采购审核单中状态为待审核的单据
    @PostMapping("sjcx")
    public AjaxResponse sjcx(@RequestBody String b){
        JSONObject jsonObject=JSONObject.parseObject(b);
        int currenPage = jsonObject.getInteger("currentPage");
        int pageSize = jsonObject.getInteger("pageSize");
        String data1 = jsonObject.getString("data1");
        String data2 = jsonObject.getString("data2");
        Map<String,Object> map=new HashMap<>();
        Page<Object> pg= PageHelper.startPage(currenPage,pageSize);
        List<WxmxhzVo> list = this.mainbillingService.sjcx(data1,data2);
        map.put("total",pg.getTotal());
        map.put("rows",list);
        return AjaxResponse.success(map);
    }

}