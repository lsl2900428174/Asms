package com.trkj.asms.service.impl;

import com.trkj.asms.dao.WReturnedmaterialsDao;
import com.trkj.asms.entity.WMaterialorder;
import com.trkj.asms.dao.WMaterialorderDao;
import com.trkj.asms.service.WMaterialorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物资采购订单表和库存表(WMaterialorder)表服务实现类
 *
 * @author makejava
 * @since 2021-07-11 20:23:17
 */
@Transactional
@Service("wMaterialorderService")
public class WMaterialorderServiceImpl implements WMaterialorderService {
    @Resource
    private WMaterialorderDao wMaterialorderDao;
    @Resource
    private WReturnedmaterialsDao wReturnedmaterialsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param moId 主键
     * @return 实例对象
     */
    @Override
    public WMaterialorder queryById(Integer moId) {
        return this.wMaterialorderDao.queryById(moId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<WMaterialorder> queryAllByLimit(int offset, int limit) {
        return this.wMaterialorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wMaterialorder 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean insert(WMaterialorder wMaterialorder) {
        try {
            int add = this.wMaterialorderDao.insert(wMaterialorder);
            if(add >= 1){
                int addlist = this.wReturnedmaterialsDao.insertBatch(wMaterialorder.getWReturnedmaterials());
                if(addlist >= 1){
                    return true;
                }
            }
        }catch (Exception e){
            //捕抓异常进行事务回滚操作，新增失败
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            System.out.println(e.getMessage());

        }finally {
            return false;
        }


    }

    /**
     * 修改数据
     *
     * @param wMaterialorder 实例对象
     * @return 实例对象
     */
    @Override
    public WMaterialorder update(WMaterialorder wMaterialorder) {
        this.wMaterialorderDao.update(wMaterialorder);
        return this.queryById(wMaterialorder.getMoId());
    }

    /**
     * 通过主键删除数据
     *
     * @param moId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer moId) {
        return this.wMaterialorderDao.deleteById(moId) > 0;
    }
}
