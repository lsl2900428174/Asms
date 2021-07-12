package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Pendingpayment;
import com.trkj.asms.dao.PendingpaymentDao;
import com.trkj.asms.service.PendingpaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 待付列表(Pendingpayment)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 07:46:50
 */
@Service("pendingpaymentService")
public class PendingpaymentServiceImpl implements PendingpaymentService {
    @Resource
    private PendingpaymentDao pendingpaymentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Pendingpayment queryById(Integer id) {
        return this.pendingpaymentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Pendingpayment> queryAllByLimit(int offset, int limit) {
        return this.pendingpaymentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pendingpayment 实例对象
     * @return 实例对象
     */
    @Override
    public Pendingpayment insert(Pendingpayment pendingpayment) {
        this.pendingpaymentDao.insert(pendingpayment);
        return pendingpayment;
    }

    /**
     * 修改数据
     *
     * @param pendingpayment 实例对象
     * @return 实例对象
     */
    @Override
    public Pendingpayment update(Pendingpayment pendingpayment) {
        this.pendingpaymentDao.update(pendingpayment);
        return this.queryById(pendingpayment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.pendingpaymentDao.deleteById(id) > 0;
    }
}
