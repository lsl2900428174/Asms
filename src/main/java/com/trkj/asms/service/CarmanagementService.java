package com.trkj.asms.service;

import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.Carmanagement;
import com.trkj.asms.vo.CheliangVo;

import java.util.List;

/**
 * 车辆管理表(Carmanagement)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 00:38:34
 */
public interface CarmanagementService {
    List<Carmanagement> findall2();

    PageInfo<CheliangVo> findall(int currentPage, int pageSize);

    /**
     * 通过ID查询单条数据
     *
     * @param carmagid 主键
     * @return 实例对象
     */
    Carmanagement queryById(Integer carmagid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Carmanagement> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carmanagement 实例对象
     * @return 实例对象
     */
    Boolean insert(Carmanagement carmanagement);

    /**
     * 修改数据
     *
     * @param carmanagement 实例对象
     * @return 实例对象
     */
    Carmanagement update(Carmanagement carmanagement);

    /**
     * 通过主键删除数据
     *
     * @param carmagid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer carmagid);

}
