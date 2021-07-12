package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.dao.WReturnedmaterialsDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.WPickingoutorder;
import com.trkj.asms.dao.WPickingoutorderDao;
import com.trkj.asms.entity.WReturnedmaterials;
import com.trkj.asms.service.WPickingoutorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 维修领料出库单(WPickingoutorder)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 13:29:19
 */
@Service("wPickingoutorderService")
@Transactional
public class WPickingoutorderServiceImpl implements WPickingoutorderService {
    @Resource
    private WPickingoutorderDao wPickingoutorderDao;
    @Resource
    private WReturnedmaterialsDao wReturnedmaterialsDao;
    @Resource
    private DueinDao dueinDao;

    /**
     * 通过ID查询单条数据
     *
     * @param poId 主键
     * @return 实例对象
     */
    @Override
    public WPickingoutorder queryById(Integer poId) {
        return this.wPickingoutorderDao.queryById(poId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<WPickingoutorder> queryAllByLimit(int offset, int limit) {
        return this.wPickingoutorderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param wPickingoutorder 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(WPickingoutorder wPickingoutorder) {
        try {
            int add = this.wPickingoutorderDao.insert(wPickingoutorder);
            if(add >= 1){
                int addlist = this.wReturnedmaterialsDao.insertBatch(wPickingoutorder.getWReturnedmaterials());
                if(addlist >= 1) {
                    Duein duein = new Duein();

                    duein.setSId(1);//门店
                    duein.setDocumentnumber(wPickingoutorder.getBillcode());//单据编号
                    duein.setDocumenttype("维修领料出库单");
                    duein.setDocumentstatus(1);//已登记
                    duein.setDocumentdate(new Date());
                    duein.setRelationship("供应商");
                    duein.setCustomerid(1);//往来客户编号
                    BigDecimal amount = new BigDecimal(0);
                    for (WReturnedmaterials item : wPickingoutorder.getWReturnedmaterials()) {
                        amount.add(new BigDecimal(item.getAmountprice()));
                    }
                    duein.setOrderamount(amount);//收款金额
                    duein.setOperator(wPickingoutorder.getUsername());//经手人
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
     * @param wPickingoutorder 实例对象
     * @return 实例对象
     */
    @Override
    public WPickingoutorder update(WPickingoutorder wPickingoutorder) {
        this.wPickingoutorderDao.update(wPickingoutorder);
        return this.queryById(wPickingoutorder.getPoId());
    }

    /**
     * 通过主键删除数据
     *
     * @param poId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer poId) {
        return this.wPickingoutorderDao.deleteById(poId) > 0;
    }
}
