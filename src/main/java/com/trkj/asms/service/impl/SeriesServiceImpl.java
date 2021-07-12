package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Series;
import com.trkj.asms.dao.SeriesDao;
import com.trkj.asms.service.SeriesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车辆车系表(Series)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:39:27
 */
@Service("seriesService")
public class SeriesServiceImpl implements SeriesService {
    @Resource
    private SeriesDao seriesDao;

    @Override
    public List<Series> findall() {
        return seriesDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param vsId 主键
     * @return 实例对象
     */
    @Override
    public Series queryById(Integer vsId) {
        return this.seriesDao.queryById(vsId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Series> queryAllByLimit(int offset, int limit) {
        return this.seriesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    @Override
    public Series insert(Series series) {
        this.seriesDao.insert(series);
        return series;
    }

    /**
     * 修改数据
     *
     * @param series 实例对象
     * @return 实例对象
     */
    @Override
    public Series update(Series series) {
        this.seriesDao.update(series);
        return this.queryById(series.getVsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param vsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer vsId) {
        return this.seriesDao.deleteById(vsId) > 0;
    }
}
