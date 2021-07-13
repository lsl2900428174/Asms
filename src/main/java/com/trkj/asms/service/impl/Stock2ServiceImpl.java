package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Stock1;
import com.trkj.asms.entity.Stock2;
import com.trkj.asms.dao.Stock2Dao;
import com.trkj.asms.entity.Stock3;
import com.trkj.asms.service.Stock2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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
     * 通过预警查询数据
     *
     * @return 实例对象
     */
    @Override
    public List<Stock3> selectByWarn() {
        List<Stock3> list = this.stock2Dao.selectByWarn();
        List<Stock3> warn = new ArrayList<>();
        for (Stock3 item:list) {
            System.out.println(item.toString());
            //小于最低库存
            if(item.getLox()>item.getNumber()){
                item.setWstate(1);
                item.setLo(item.getLox()-item.getNumber());
                warn.add(item);
            }else if(item.getUpx()<item.getNumber()){
                item.setWstate(2);
                item.setUp(item.getNumber()-item.getUpx());
                warn.add(item);
            }
        }
        return warn;
    }

    /**
     * 查询所有数据
     * @return
     */
    @Override
    public List<Stock3> selectAlls() {
        return this.stock2Dao.selectAlls();
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
     * @param stock1 实例对象
     * @return 实例对象
     */
    @Override
    public Stock2 update(Stock1 stock1) {
        this.stock2Dao.update(stock1);
        return this.queryById(stock1.getId());
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
