package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Supplier;
import com.trkj.asms.dao.SupplierDao;
import com.trkj.asms.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Supplier)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 20:17:41
 */
@Service("supplierService")
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierDao supplierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Supplier queryById(Integer id) {
        return this.supplierDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Supplier> queryAllByLimit(int offset, int limit) {
        return this.supplierDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    @Override
    public Supplier insert(Supplier supplier) {
        this.supplierDao.insert(supplier);
        return supplier;
    }

    /**
     * 修改数据
     *
     * @param supplier 实例对象
     * @return 实例对象
     */
    @Override
    public Supplier update(Supplier supplier) {
        this.supplierDao.update(supplier);
        return this.queryById(supplier.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.supplierDao.deleteById(id) > 0;
    }

    @Override
    public List<Supplier> queryAll() {
        return this.supplierDao.queryAll(new Supplier());
    }
}
