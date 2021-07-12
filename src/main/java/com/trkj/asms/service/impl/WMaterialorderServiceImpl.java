package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.dao.PendingpaymentDao;
import com.trkj.asms.dao.WReturnedmaterialsDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.Pendingpayment;
import com.trkj.asms.entity.WMaterialorder;
import com.trkj.asms.dao.WMaterialorderDao;
import com.trkj.asms.service.WMaterialorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
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
    @Resource
    private PendingpaymentDao pendingpaymentDao;

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
                    Pendingpayment duein = new Pendingpayment();

                    duein.setSId(1);//门店
                    duein.setDocumentnumber(wMaterialorder.getBillcode());//单据编号
                    duein.setDocumenttype("物资采购入库单");
                    duein.setDocumentstatus(1);//已登记
                    duein.setDocumentdate(new Date());
                    duein.setRelationship("供应商");
                    duein.setCustomerid(1);//往来客户编号
                    duein.setOrderamount(wMaterialorder.getAmout());//付款金额
                    duein.setBrokerage(wMaterialorder.getOrderuser());//经手人
                    duein.setTimeliness(0);//时效性 0未失效
                    int addduein = pendingpaymentDao.insertSelective(duein);
                    if(addduein >= 1){
                        return true;
                    }
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
