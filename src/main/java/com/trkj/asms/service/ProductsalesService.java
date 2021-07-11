package com.trkj.asms.service;

import com.trkj.asms.entity.Productsales;
import java.util.List;

/**
 * 用品销售表(Productsales)表服务接口
 *
 * @author makejava
 * @since 2021-07-12 00:58:50
 */
public interface ProductsalesService {

    /**
     * 通过ID查询单条数据
     *
     * @param  主键
     * @return 实例对象
     */
    Productsales queryById( );

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Productsales> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param productsales 实例对象
     * @return 实例对象
     */
    Productsales insert(Productsales productsales);

    /**
     * 修改数据
     *
     * @param productsales 实例对象
     * @return 实例对象
     */
    Productsales update(Productsales productsales);

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}