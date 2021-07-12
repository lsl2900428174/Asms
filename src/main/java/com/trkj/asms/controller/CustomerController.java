package com.trkj.asms.controller;

import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Customer;
import com.trkj.asms.service.CustomerService;
import com.trkj.asms.vo.AjaxResponse;
import com.trkj.asms.vo.KehuVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户表(Customer)表控制层
 *
 * @author makejava
 * @since 2021-07-11 19:58:58
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Customer selectOne(Integer id) {
        return this.customerService.queryById(id);
    }

    /**
     * 查询所有客户数据分页
     * @param currentPage
     * @param pageSize
     * @return
     */
    @GetMapping("findall")
    public PageInfo<KehuVo> findall(Integer currentPage, Integer pageSize){
        PageInfo<KehuVo> info = customerService.findalls(currentPage,pageSize);
        return info;
    }
    /**
     * 查询所有客户数据
     * @param
     * @param
     * @return
     */
    @GetMapping("findalls")
    public List<Customer> findall2(){
        List<Customer> info = customerService.findall();
        return info;
    }

    /**
     * 添加客户资料
     * @param customer
     * @return
     */
    @PostMapping("addkehu")
    public Customer addkehu(@RequestBody Customer customer){
        return this.customerService.insert(customer);
    }


}
