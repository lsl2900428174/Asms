package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Materialbrand;
import com.trkj.asms.dao.MaterialbrandDao;
import com.trkj.asms.service.MaterialbrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物资品牌表(Materialbrand)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 20:02:06
 */
@Service("materialbrandService")
@Transactional
public class MaterialbrandServiceImpl implements MaterialbrandService {
    @Resource
    private MaterialbrandDao materialbrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public Materialbrand queryById(Integer mId) {
        return this.materialbrandDao.queryById(mId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Materialbrand> queryAllByLimit(int offset, int limit) {
        return this.materialbrandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param materialbrand 实例对象
     * @return 实例对象
     */
    @Override
    public Materialbrand insert(Materialbrand materialbrand) {
        this.materialbrandDao.insert(materialbrand);
        return materialbrand;
    }

    /**
     * 修改数据
     *
     * @param materialbrand 实例对象
     * @return 实例对象
     */
    @Override
    public Materialbrand update(Materialbrand materialbrand) {
        this.materialbrandDao.update(materialbrand);
        return this.queryById(materialbrand.getMId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mId) {
        return this.materialbrandDao.deleteById(mId) > 0;
    }

    /**
     * 获取供应商
     * @return
     */
    @Override
    public List<Materialbrand> queryAll() {
        return this.materialbrandDao.queryAll(new Materialbrand());
    }
}
