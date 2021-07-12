package com.trkj.asms.controller;

import com.trkj.asms.entity.Emp;
import com.trkj.asms.service.EmpService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工表(Emp)表控制层
 *
 * @author makejava
 * @since 2021-07-11 21:06:40
 */
@RestController
@RequestMapping("emp")
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Emp selectOne(Integer id) {
        return this.empService.queryById(id);
    }

    /**
     * 查看所有员工
     * @return
     */
    @GetMapping("findall")
    public List<Emp> findall(){
        return this.empService.findall();
    }

}
