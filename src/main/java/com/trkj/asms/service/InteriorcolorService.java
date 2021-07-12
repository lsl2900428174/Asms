package com.trkj.asms.service;

import com.trkj.asms.entity.Interiorcolor;

import java.util.List;

/**
 * 内饰颜色表(Interiorcolor)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 21:40:40
 */
public interface InteriorcolorService {

    List<Interiorcolor> findall();

    /**
     * 通过ID查询单条数据
     *
     * @param iId 主键
     * @return 实例对象
     */
    Interiorcolor queryById(Integer iId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Interiorcolor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param interiorcolor 实例对象
     * @return 实例对象
     */
    Interiorcolor insert(Interiorcolor interiorcolor);

    /**
     * 修改数据
     *
     * @param interiorcolor 实例对象
     * @return 实例对象
     */
    Interiorcolor update(Interiorcolor interiorcolor);

    /**
     * 通过主键删除数据
     *
     * @param iId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer iId);

}
