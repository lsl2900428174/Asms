package com.trkj.asms.service;

import com.trkj.asms.entity.TMemberprices;

import java.util.List;

/**
 * (TMemberprices)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 11:02:26
 */
public interface TMemberpricesService {

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    TMemberprices queryById(Integer mId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TMemberprices> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tMemberprices 实例对象
     * @return 实例对象
     */
    Boolean insert(TMemberprices tMemberprices);

    /**
     * 修改数据
     *
     * @param tMemberprices 实例对象
     * @return 实例对象
     */
    TMemberprices update(TMemberprices tMemberprices);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mId);

}
