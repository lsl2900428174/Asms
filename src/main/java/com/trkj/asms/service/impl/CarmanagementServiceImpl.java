package com.trkj.asms.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Carmanagement;
import com.trkj.asms.dao.CarmanagementDao;
import com.trkj.asms.service.CarmanagementService;
import com.trkj.asms.vo.CheliangVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆管理表(Carmanagement)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 00:38:35
 */
@Service("carmanagementService")
public class CarmanagementServiceImpl implements CarmanagementService {
    @Resource
    private CarmanagementDao carmanagementDao;

    /**
     * 查询所有车辆下拉框接口
     * @return
     */
    @Override
    public List<Carmanagement> findall2() {
        return this.carmanagementDao.findall2();
    }

    /**
     * 查询车辆资料分页
     * @return
     */
    @Override
    public PageInfo<CheliangVo> findall(int currentPage, int pageSize) {
        Page<CheliangVo> page = PageHelper.startPage(currentPage,pageSize,true);
        List<CheliangVo> list = carmanagementDao.findall();
        PageInfo<CheliangVo> info = new PageInfo<>(list);
        info.setTotal(list.size());
        return info;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param carmagid 主键
     * @return 实例对象
     */
    @Override
    public Carmanagement queryById(Integer carmagid) {
        return this.carmanagementDao.queryById(carmagid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Carmanagement> queryAllByLimit(int offset, int limit) {
        return this.carmanagementDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carmanagement 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public Boolean insert(Carmanagement carmanagement) {
        int add = this.carmanagementDao.insert(carmanagement);
        if(add == 1){
            return true;
        }
        return false;
    }

    /**
     * 修改数据
     *
     * @param carmanagement 实例对象
     * @return 实例对象
     */
    @Override
    public Carmanagement update(Carmanagement carmanagement) {
        this.carmanagementDao.update(carmanagement);
        return this.queryById(carmanagement.getCarmagid());
    }

    /**
     * 通过主键删除数据
     *
     * @param carmagid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer carmagid) {
        return this.carmanagementDao.deleteById(carmagid) > 0;
    }
}
