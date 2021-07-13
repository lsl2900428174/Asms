package com.trkj.asms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Carmanagement;
import com.trkj.asms.entity.Customer;
import com.trkj.asms.service.CarmanagementService;
import com.trkj.asms.vo.AjaxResponse;
import com.trkj.asms.vo.CheliangVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆管理表(Carmanagement)表控制层
 *
 * @author makejava
 * @since 2021-07-12 00:38:36
 */
@RestController
@RequestMapping("carmanagement")
public class CarmanagementController {
    /**
     * 服务对象
     */
    @Resource
    private CarmanagementService carmanagementService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Carmanagement selectOne(Integer id) {
        return this.carmanagementService.queryById(id);
    }

    /**
     * 分页查询车辆信息
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("findall")
    public PageInfo<CheliangVo> findall(Integer currentPage, Integer pageSize){
        return this.carmanagementService.findall(currentPage,pageSize);
    }

    /**
     * 下拉框接口车辆
     * @return
     */
    @GetMapping("findall2")
    public List<Carmanagement> findall2(){
        return this.carmanagementService.findall2();
    }

    /**
     * 新增车辆信息
     * @param
     * @return
     */
    @PostMapping("addcheliang")
    public AjaxResponse addcheliang(@RequestBody String kehu){
        String message = "";
        JSONObject jsonObject=JSONObject.parseObject(kehu);
        String one = jsonObject.getString("kehu");
        Carmanagement customer = JSON.parseObject(one,Carmanagement.class);
        Boolean add = this.carmanagementService.insert(customer);
        if(add == true){
            message = "添加成功";
        }else{
            message = "添加失败";
        }
        return AjaxResponse.success(message);
    }

}
