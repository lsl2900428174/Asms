package com.trkj.asms.service;

import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Customer;
import com.trkj.asms.vo.KehuVo;

import java.util.List;

/**
 * 客户表(Customer)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 19:58:57
 */
public interface CustomerService {

    KehuVo findbycname(String cName);

    List<Customer> findall();
    PageInfo<KehuVo> findalls(int currentPage, int pageSize );
    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    Customer queryById(Integer cId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer insert(Customer customer);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 实例对象
     */
    Customer update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cId);

}
