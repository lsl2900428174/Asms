package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Savings;
import com.trkj.asms.dao.SavingsDao;
import com.trkj.asms.service.SavingsService;
import com.trkj.asms.vo.SavingVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Savings)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 02:41:59
 */
@Service("savingsService")
public class SavingsServiceImpl implements SavingsService {
    @Resource
    private SavingsDao savingsDao;

    /**
     * 根据客户名称查询储值卡信息
     * @param name
     * @return
     */
    @Override
    public Savings findbyname(String name) {
        return this.savingsDao.findbyname(name);
    }

    @Override
    public List<SavingVo> findall() {
        
        return this.savingsDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param savingsid 主键
     * @return 实例对象
     */
    @Override
    public Savings queryById(Integer savingsid) {
        return this.savingsDao.queryById(savingsid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Savings> queryAllByLimit(int offset, int limit) {
        return this.savingsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param savings 实例对象
     * @return 实例对象
     */
    @Override
    public Savings insert(Savings savings) {
        this.savingsDao.insert(savings);
        return savings;
    }

    /**
     * 修改数据
     *
     * @param savings 实例对象
     * @return 实例对象
     */
    @Override
    public Savings update(Savings savings) {
        this.savingsDao.update(savings);
        return this.queryById(savings.getSavingsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param savingsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer savingsid) {
        return this.savingsDao.deleteById(savingsid) > 0;
    }
}
