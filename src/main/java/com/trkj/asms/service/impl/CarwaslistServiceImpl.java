package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Carwaslist;
import com.trkj.asms.dao.CarwaslistDao;
import com.trkj.asms.service.CarwaslistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Carwaslist)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 00:05:41
 */
@Service("carwaslistService")
public class CarwaslistServiceImpl implements CarwaslistService {
    @Resource
    private CarwaslistDao carwaslistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    @Override
    public Carwaslist queryById(Integer carid) {
        return this.carwaslistDao.queryById(carid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Carwaslist> queryAllByLimit(int offset, int limit) {
        return this.carwaslistDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carwaslist 实例对象
     * @return 实例对象
     */
    @Override
    public Carwaslist insert(Carwaslist carwaslist) {
        this.carwaslistDao.insert(carwaslist);
        return carwaslist;
    }

    /**
     * 修改数据
     *
     * @param carwaslist 实例对象
     * @return 实例对象
     */
    @Override
    public Carwaslist update(Carwaslist carwaslist) {
        this.carwaslistDao.update(carwaslist);
        return this.queryById(carwaslist.getCarid());
    }

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer carid) {
        return this.carwaslistDao.deleteById(carid) > 0;
    }
}