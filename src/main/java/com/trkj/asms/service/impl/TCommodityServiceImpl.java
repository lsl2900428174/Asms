package com.trkj.asms.service.impl;

import com.trkj.asms.entity.TCommodity;
import com.trkj.asms.dao.TCommodityDao;
import com.trkj.asms.service.TCommodityService;
import com.trkj.asms.vo.wzVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物资商品表(TCommodity)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 20:53:47
 */
@Service("tCommodityService")
public class TCommodityServiceImpl implements TCommodityService {
    @Resource
    private TCommodityDao tCommodityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param coId 主键
     * @return 实例对象
     */
    @Override
    public TCommodity queryById(Integer coId) {
        return this.tCommodityDao.queryById(coId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TCommodity> queryAllByLimit(int offset, int limit) {
        return this.tCommodityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tCommodity 实例对象
     * @return 实例对象
     */
    @Override
    public TCommodity insert(TCommodity tCommodity) {
        this.tCommodityDao.insert(tCommodity);
        return tCommodity;
    }

    /**
     * 修改数据
     *
     * @param tCommodity 实例对象
     * @return 实例对象
     */
    @Override
    public TCommodity update(TCommodity tCommodity) {
        this.tCommodityDao.update(tCommodity);
        return this.queryById(tCommodity.getCoId());
    }

    /**
     * 通过主键删除数据
     *
     * @param coId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer coId) {
        return this.tCommodityDao.deleteById(coId) > 0;
    }

    /**
     *材料领料汇总
     */
    @Override
    public List<wzVo> cllyhz() {
        List<wzVo> list = this.tCommodityDao.cllyhz();
        return list;
    }
}
