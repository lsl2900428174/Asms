package com.trkj.asms.service.impl;

import com.trkj.asms.entity.Productsales;
import com.trkj.asms.dao.ProductsalesDao;
import com.trkj.asms.service.ProductsalesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用品销售表(Productsales)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 00:58:50
 */
@Service("productsalesService")
public class ProductsalesServiceImpl implements ProductsalesService {
    @Resource
    private ProductsalesDao productsalesDao;



    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Productsales> queryAllByLimit(int offset, int limit) {
        return this.productsalesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param productsales 实例对象
     * @return 实例对象
     */
    @Override
    public Productsales insert(Productsales productsales) {
        this.productsalesDao.insert(productsales);
        return productsales;
    }




}