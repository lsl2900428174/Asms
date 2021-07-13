package com.trkj.asms.service;

import com.trkj.asms.entity.TCommodity;
import com.trkj.asms.vo.wzVo;

import java.util.List;

/**
 * 物资商品表(TCommodity)表服务接口
 *
 * @author makejava
 * @since 2021-07-11 20:53:46
 */
public interface TCommodityService {

    /**
     * 通过ID查询单条数据
     *
     * @param coId 主键
     * @return 实例对象
     */
    TCommodity queryById(Integer coId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TCommodity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tCommodity 实例对象
     * @return 实例对象
     */
    TCommodity insert(TCommodity tCommodity);

    /**
     * 修改数据
     *
     * @param tCommodity 实例对象
     * @return 实例对象
     */
    TCommodity update(TCommodity tCommodity);

    /**
     * 通过主键删除数据
     *
     * @param coId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer coId);

    List<wzVo> cllyhz();

}
