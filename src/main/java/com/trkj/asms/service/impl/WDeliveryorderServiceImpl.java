package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.dao.WReturnedmaterialsDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.WDeliveryorder;
import com.trkj.asms.dao.WDeliveryorderDao;
import com.trkj.asms.entity.WReturnedmaterials;
import com.trkj.asms.service.WDeliveryorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 物资采购退货出库单(WDeliveryorder)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 15:42:32
 */
@Service("wDeliveryorderService")
public class WDeliveryorderServiceImpl implements WDeliveryorderService {
    @Resource
    private WDeliveryorderDao wDeliveryorderDao;
    @Resource
    private WReturnedmaterialsDao wReturnedmaterialsDao;
    @Resource
    private DueinDao dueinDao;

    /**
     * 通过ID查询单条数据
     *
     * @param doId 主键
     * @return 实例对象
     */
    @Override
    public WDeliveryorder queryById(Integer doId) {
        return this.wDeliveryorderDao.queryById(doId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<WDeliveryorder> queryAllByLimit(int offset, int limit) {
        return this.wDeliveryorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wDeliveryorder 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(WDeliveryorder wDeliveryorder) {
        try {
            int add = this.wDeliveryorderDao.insert(wDeliveryorder);
            if(add >= 1){
                int addlist = this.wReturnedmaterialsDao.insertBatch(wDeliveryorder.getWReturnedmaterials());
                if(addlist >= 1) {
                    Duein duein = new Duein();

                    duein.setSId(1);//门店
                    duein.setDocumentnumber(wDeliveryorder.getBillcode());//单据编号
                    duein.setDocumenttype("物资采购退货出库单");
                    duein.setDocumentstatus(1);//已登记
                    duein.setDocumentdate(new Date());
                    duein.setRelationship("供应商");
                    duein.setCustomerid(1);//往来客户编号
                    BigDecimal amount = new BigDecimal(0);
                    for (WReturnedmaterials item : wDeliveryorder.getWReturnedmaterials()) {
                        amount.add(new BigDecimal(item.getAmountprice()));
                    }
                    duein.setOrderamount(amount);//收款金额
                    duein.setOperator(wDeliveryorder.getPickingId());//经手人
                    duein.setTimeliness(0);//时效性 0未失效
                    int addduein = dueinDao.insertSelective(duein);
                    if (addduein >= 1) {
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
     * @param wDeliveryorder 实例对象
     * @return 实例对象
     */
    @Override
    public WDeliveryorder update(WDeliveryorder wDeliveryorder) {
        this.wDeliveryorderDao.update(wDeliveryorder);
        return this.queryById(wDeliveryorder.getDoId());
    }

    /**
     * 通过主键删除数据
     *
     * @param doId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer doId) {
        return this.wDeliveryorderDao.deleteById(doId) > 0;
    }
}
