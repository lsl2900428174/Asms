package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Color;
import com.trkj.asms.dao.ColorDao;
import com.trkj.asms.service.ColorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车身颜色表(Color)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:41:12
 */
@Service("colorService")
public class ColorServiceImpl implements ColorService {
    @Resource
    private ColorDao colorDao;

    @Override
    public List<Color> findall() {
        return this.colorDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param bcId 主键
     * @return 实例对象
     */
    @Override
    public Color queryById(Integer bcId) {
        return this.colorDao.queryById(bcId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Color> queryAllByLimit(int offset, int limit) {
        return this.colorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    @Override
    public Color insert(Color color) {
        this.colorDao.insert(color);
        return color;
    }

    /**
     * 修改数据
     *
     * @param color 实例对象
     * @return 实例对象
     */
    @Override
    public Color update(Color color) {
        this.colorDao.update(color);
        return this.queryById(color.getBcId());
    }

    /**
     * 通过主键删除数据
     *
     * @param bcId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bcId) {
        return this.colorDao.deleteById(bcId) > 0;
    }
}
