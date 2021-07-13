package com.trkj.asms.service.impl;

import com.trkj.asms.dao.*;
import com.trkj.asms.entity.*;
import com.trkj.asms.service.WMaterialorderService;
import com.trkj.asms.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Resource
    private IdWorker idWorker;
    @Resource
    private Stock2Dao stock2Dao;

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
            //新增采购记录

            wMaterialorder.setBilldate(new Date());
            wMaterialorder.setState(1);
            System.out.println(wMaterialorder);
            Double d = new Double(0);
            for (WReturnedmaterials item:wMaterialorder.getWReturnedmaterials()) {
                d+= item.getAmountprice();
            }
            wMaterialorder.setAmout(d);


            System.out.println(wMaterialorder.toString());

            int bill = (int) idWorker.nextId();
            wMaterialorder.setBillcode(String.valueOf(bill));

            int add = this.wMaterialorderDao.insert(wMaterialorder);
            wMaterialorder.setBilldate(wMaterialorder.getBilldate());
            System.out.println(add);
            if(add >= 1){
                //新增物资记录
                //设置相同的编号跟随主键变化
                for (WReturnedmaterials item:wMaterialorder.getWReturnedmaterials()) {
                    System.out.println(item.toString());
                    item.setBillcode(String.valueOf(bill));
                }

                int addlist = this.wReturnedmaterialsDao.insertBatch(wMaterialorder.getWReturnedmaterials());
                System.out.println("库存");
                //修改库存数量
                Stock1 stock1 = new Stock1();
                //拿出物资的编号
                for (WReturnedmaterials item:wMaterialorder.getWReturnedmaterials()) {

                    List<Stock2> s = stock2Dao.selectAll();
                    System.out.println(s);
                    for (Stock2 items:s) {
                        System.out.println(items);
                        //匹配一样的物资编号拿到id
                        if(items.getCoCode().equals(item.getMaterialcode())){
                            System.out.println(items.getId());
                            stock1.setId(items.getId());
                            stock1.setNumber(items.getNumber()+item.getBacknumber());
                        }

                    }

                    System.out.println(stock1.toString());
                    stock2Dao.update(stock1);

                }

                System.out.println(addlist);
                if(addlist >= 1){

                    //新增付款单
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
                    System.out.println(duein.toString());
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

    @Override
    public List<WMaterialorder> queryAll(WMaterialorder wMaterialorder) {
        return wMaterialorderDao.queryAll(wMaterialorder);
    }
}
