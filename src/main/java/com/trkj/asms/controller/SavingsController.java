package com.trkj.asms.controller;

import com.trkj.asms.entity.Savings;
import com.trkj.asms.service.SavingsService;
import com.trkj.asms.vo.SavingVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Savings)表控制层
 *
 * @author makejava
 * @since 2021-07-12 02:41:59
 */
@RestController
@RequestMapping("savings")
public class SavingsController {
    /**
     * 服务对象
     */
    @Resource
    private SavingsService savingsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Savings selectOne(Integer id) {
        return this.savingsService.queryById(id);
    }

    /**
     * 查询客户的储值卡余额
     * @return
     */
    @GetMapping("findall")
    public List<SavingVo> findall(){
        return this.savingsService.findall();
    }

    /**
     *
     * @param name
     * @return
     */
    @GetMapping("findbyname")
    public Savings findbyname(String cName){
        System.out.println(cName);
        return this.savingsService.findbyname(cName);
    }

}
