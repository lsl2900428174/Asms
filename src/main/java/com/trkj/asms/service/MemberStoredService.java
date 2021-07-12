package com.trkj.asms.service;

import com.trkj.asms.entity.MemberStored;

import java.util.List;

/**
 * (MemberStored)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 02:38:43
 */
public interface MemberStoredService {

    Boolean addchuzhi(MemberStored memberStored);

    List<MemberStored> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    MemberStored queryById(Integer mId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<MemberStored> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param memberStored 实例对象
     * @return 实例对象
     */
    MemberStored insert(MemberStored memberStored);

    /**
     * 修改数据
     *
     * @param memberStored 实例对象
     * @return 实例对象
     */
    MemberStored update(MemberStored memberStored);

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mId);

}
