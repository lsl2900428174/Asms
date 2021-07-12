package com.trkj.asms.service.impl;

import com.trkj.asms.entity.WReturnedmaterials;
import com.trkj.asms.dao.WReturnedmaterialsDao;
import com.trkj.asms.service.WReturnedmaterialsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 退货物资(WReturnedmaterials)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 09:19:37
 */
@Transactional
@Service("wReturnedmaterialsService")
public class WReturnedmaterialsServiceImpl implements WReturnedmaterialsService {
    @Resource
    private WReturnedmaterialsDao wReturnedmaterialsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    @Override
    public WReturnedmaterials queryById(Integer rId) {
        return this.wReturnedmaterialsDao.queryById(rId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<WReturnedmaterials> queryAllByLimit(int offset, int limit) {
        return this.wReturnedmaterialsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询多条数据
     * @return 对象列表
     */
    @Override
    public List<WReturnedmaterials> queryAll(WReturnedmaterials billcode) {
        return this.wReturnedmaterialsDao.queryAll(billcode);
    }

    /**
     * 新增数据
     *
     * @param wReturnedmaterials 实例对象
     * @return 实例对象
     */
    @Override
    public WReturnedmaterials insert(WReturnedmaterials wReturnedmaterials) {
        this.wReturnedmaterialsDao.insert(wReturnedmaterials);
        return wReturnedmaterials;
    }

    @Override
    public List<WReturnedmaterials> insertBatch(List<WReturnedmaterials> entities) {
        this.wReturnedmaterialsDao.insertBatch(entities);
        return entities;
    }

    /**
     * 修改数据
     *
     * @param wReturnedmaterials 实例对象
     * @return 实例对象
     */
    @Override
    public WReturnedmaterials update(WReturnedmaterials wReturnedmaterials) {
        this.wReturnedmaterialsDao.update(wReturnedmaterials);
        return this.queryById(wReturnedmaterials.getRId());
    }

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rId) {
        return this.wReturnedmaterialsDao.deleteById(rId) > 0;
    }
    
}
