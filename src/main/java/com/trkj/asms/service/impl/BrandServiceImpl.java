package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Brand;
import com.trkj.asms.dao.BrandDao;
import com.trkj.asms.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆品牌表(Brand)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:38:30
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Brand> findall() {
        return this.brandDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param bId 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Integer bId) {
        return this.brandDao.queryById(bId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Brand> queryAllByLimit(int offset, int limit) {
        return this.brandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand insert(Brand brand) {
        this.brandDao.insert(brand);
        return brand;
    }

    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 实例对象
     */
    @Override
    public Brand update(Brand brand) {
        this.brandDao.update(brand);
        return this.queryById(brand.getBId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bId) {
        return this.brandDao.deleteById(bId) > 0;
    }
}
