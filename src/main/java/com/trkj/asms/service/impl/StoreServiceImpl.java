package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Store;
import com.trkj.asms.dao.StoreDao;
import com.trkj.asms.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 门店表(Store)表服务实现类
 *
 * @author lishilong
 * @since 2021-07-11 11:12:07
 */
@Service("storeService")
public class StoreServiceImpl implements StoreService {
    @Resource
    private StoreDao storeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sId 主键
     * @return 实例对象
     */
    @Override
    public Store queryById(Integer sId) {
        return this.storeDao.queryById(sId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Store> queryAllByLimit(int offset, int limit) {
        return this.storeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param store 实例对象
     * @return 实例对象
     */
    @Override
    public Store insert(Store store) {
        this.storeDao.insert(store);
        return store;
    }

    /**
     * 修改数据
     *
     * @param store 实例对象
     * @return 实例对象
     */
    @Override
    public Store update(Store store) {
        this.storeDao.update(store);
        return this.queryById(store.getSId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sId) {
        return this.storeDao.deleteById(sId) > 0;
    }
}
