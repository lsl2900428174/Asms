package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Customertype;
import com.trkj.asms.dao.CustomertypeDao;
import com.trkj.asms.service.CustomertypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户类型表(Customertype)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:00:42
 */
@Service("customertypeService")
public class CustomertypeServiceImpl implements CustomertypeService {
    @Resource
    private CustomertypeDao customertypeDao;

    /**
     * c查询所有客户类型
     * @return
     */
    @Override
    public List<Customertype> findall() {
        return this.customertypeDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param ctId 主键
     * @return 实例对象
     */
    @Override
    public Customertype queryById(Integer ctId) {
        return this.customertypeDao.queryById(ctId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Customertype> queryAllByLimit(int offset, int limit) {
        return this.customertypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param customertype 实例对象
     * @return 实例对象
     */
    @Override
    public Customertype insert(Customertype customertype) {
        this.customertypeDao.insert(customertype);
        return customertype;
    }

    /**
     * 修改数据
     *
     * @param customertype 实例对象
     * @return 实例对象
     */
    @Override
    public Customertype update(Customertype customertype) {
        this.customertypeDao.update(customertype);
        return this.queryById(customertype.getCtId());
    }

    /**
     * 通过主键删除数据
     *
     * @param ctId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ctId) {
        return this.customertypeDao.deleteById(ctId) > 0;
    }
}
