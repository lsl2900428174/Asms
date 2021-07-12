package com.trkj.asms.controller;

import com.trkj.asms.entity.TMemberprices;
import com.trkj.asms.service.TMemberpricesService;
import com.trkj.asms.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TMemberprices)表控制层
 *
 * @author makejava
 * @since 2021-07-12 11:02:27
 */
@RestController
@RequestMapping("tMemberprices")
public class TMemberpricesController {
    /**
     * 服务对象
     */
    @Resource
    private TMemberpricesService tMemberpricesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TMemberprices selectOne(Integer id) {
        return this.tMemberpricesService.queryById(id);
    }

    /**
     * 添加会员价格（折扣新增）
     * @param tMemberprices
     * @return
     */
    @PostMapping("addjiage")
    public AjaxResponse addjiage(@RequestBody TMemberprices tMemberprices){
        String message = "";
        Boolean add = this.tMemberpricesService.insert(tMemberprices);
        if(add == true){
            message="添加成功";
        }else{
            message="添加失败";
        }
        return AjaxResponse.success(message);
    }

}
