package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Interiorcolor;
import com.trkj.asms.dao.InteriorcolorDao;
import com.trkj.asms.service.InteriorcolorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 内饰颜色表(Interiorcolor)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 21:40:41
 */
@Service("interiorcolorService")
public class InteriorcolorServiceImpl implements InteriorcolorService {
    @Resource
    private InteriorcolorDao interiorcolorDao;

    @Override
    public List<Interiorcolor> findall() {
        return this.interiorcolorDao.findall();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param iId 主键
     * @return 实例对象
     */
    @Override
    public Interiorcolor queryById(Integer iId) {
        return this.interiorcolorDao.queryById(iId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Interiorcolor> queryAllByLimit(int offset, int limit) {
        return this.interiorcolorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param interiorcolor 实例对象
     * @return 实例对象
     */
    @Override
    public Interiorcolor insert(Interiorcolor interiorcolor) {
        this.interiorcolorDao.insert(interiorcolor);
        return interiorcolor;
    }

    /**
     * 修改数据
     *
     * @param interiorcolor 实例对象
     * @return 实例对象
     */
    @Override
    public Interiorcolor update(Interiorcolor interiorcolor) {
        this.interiorcolorDao.update(interiorcolor);
        return this.queryById(interiorcolor.getIId());
    }

    /**
     * 通过主键删除数据
     *
     * @param iId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer iId) {
        return this.interiorcolorDao.deleteById(iId) > 0;
    }
}
