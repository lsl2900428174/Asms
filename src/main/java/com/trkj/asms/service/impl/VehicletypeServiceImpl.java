package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Vehicletype;
import com.trkj.asms.dao.VehicletypeDao;
import com.trkj.asms.service.VehicletypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆类型表(Vehicletype)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:40:06
 */
@Service("vehicletypeService")
public class VehicletypeServiceImpl implements VehicletypeService {
    @Resource
    private VehicletypeDao vehicletypeDao;

    @Override
    public List<Vehicletype> findall() {
        return vehicletypeDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param vId 主键
     * @return 实例对象
     */
    @Override
    public Vehicletype queryById(Integer vId) {
        return this.vehicletypeDao.queryById(vId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Vehicletype> queryAllByLimit(int offset, int limit) {
        return this.vehicletypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param vehicletype 实例对象
     * @return 实例对象
     */
    @Override
    public Vehicletype insert(Vehicletype vehicletype) {
        this.vehicletypeDao.insert(vehicletype);
        return vehicletype;
    }

    /**
     * 修改数据
     *
     * @param vehicletype 实例对象
     * @return 实例对象
     */
    @Override
    public Vehicletype update(Vehicletype vehicletype) {
        this.vehicletypeDao.update(vehicletype);
        return this.queryById(vehicletype.getVId());
    }

    /**
     * 通过主键删除数据
     *
     * @param vId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer vId) {
        return this.vehicletypeDao.deleteById(vId) > 0;
    }
}
