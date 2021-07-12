package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Stock2;
import com.trkj.asms.dao.Stock2Dao;
import com.trkj.asms.service.Stock2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Stock2)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:31:03
 */
@Service("stock2Service")
public class Stock2ServiceImpl implements Stock2Service {
    @Resource
    private Stock2Dao stock2Dao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Stock2 queryById(Integer id) {
        return this.stock2Dao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public List<Stock2> selectAll() {
        return this.stock2Dao.selectAll();
    }

    /**
     * 新增数据
     *
     * @param stock2 实例对象
     * @return 实例对象
     */
    @Override
    public Stock2 insert(Stock2 stock2) {
        this.stock2Dao.insert(stock2);
        return stock2;
    }

    /**
     * 修改数据
     *
     * @param stock2 实例对象
     * @return 实例对象
     */
    @Override
    public Stock2 update(Stock2 stock2) {
        this.stock2Dao.update(stock2);
        return this.queryById(stock2.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.stock2Dao.deleteById(id) > 0;
    }
}
