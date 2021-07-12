package com.trkj.asms.service;

import com.trkj.asms.entity.WReturnedmaterials;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 退货物资(WReturnedmaterials)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 09:19:37
 */
public interface WReturnedmaterialsService {

    /**
     * 通过ID查询单条数据
     *
     * @param rId 主键
     * @return 实例对象
     */
    WReturnedmaterials queryById(Integer rId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<WReturnedmaterials> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param wReturnedmaterials 实例对象
     * @return 实例对象
     */
    WReturnedmaterials insert(WReturnedmaterials wReturnedmaterials);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WReturnedmaterials> 实例对象列表
     * @return 影响行数
     */
    List<WReturnedmaterials> insertBatch(@Param("entities") List<WReturnedmaterials> entities);

    /**
     * 修改数据
     *
     * @param wReturnedmaterials 实例对象
     * @return 实例对象
     */
    WReturnedmaterials update(WReturnedmaterials wReturnedmaterials);

    /**
     * 通过主键删除数据
     *
     * @param rId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rId);

    /**
     * 通过编号查询所有
     * @param billcode
     * @return
     */
    public List<WReturnedmaterials> queryAll(WReturnedmaterials billcode);
}
