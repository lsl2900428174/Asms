package com.trkj.asms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Customer;
import com.trkj.asms.dao.CustomerDao;
import com.trkj.asms.service.CustomerService;
import com.trkj.asms.vo.KehuVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户表(Customer)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 19:58:57
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao;

    @Override
    public KehuVo findbycname(String cName) {
        return this.customerDao.findbycname(cName);
    }

    @Override
    public List<Customer> findall() {
        return this.customerDao.findall2();
    }

    /**
     * 查询所有客户数据
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<KehuVo> findalls(int currentPage, int pageSize) {
        Page<KehuVo> page= PageHelper.startPage(currentPage,pageSize,true);
        List<KehuVo> list = customerDao.findall();
        PageInfo<KehuVo> info=new PageInfo<>(list);
        info.setTotal(list.size());
        return info;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    @Override
    public Customer queryById(Integer cId) {
        return this.customerDao.queryById(cId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Customer> queryAllByLimit(int offset, int limit) {
        return this.customerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer insert(Customer customer) {
        this.customerDao.insert(customer);
        return customer;
    }

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    @Override
    public Customer update(Customer customer) {
        this.customerDao.update(customer);
        return this.queryById(customer.getCId());
    }

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cId) {
        return this.customerDao.deleteById(cId) > 0;
    }
}
