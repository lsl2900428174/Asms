package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.dao.SavingsDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.entity.MemberStored;
import com.trkj.asms.dao.MemberStoredDao;
import com.trkj.asms.entity.Savings;
import com.trkj.asms.service.MemberStoredService;
import com.trkj.asms.utils.IdWorker;
import com.trkj.asms.utils.Phonejiami;
import com.trkj.asms.vo.HuiyuanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * (MemberStored)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 02:38:44
 */
@Service("memberStoredService")
public class MemberStoredServiceImpl implements MemberStoredService {
    @Resource
    private MemberStoredDao memberStoredDao;
    @Resource
    private SavingsDao savingsDao;
    @Resource
    private DueinDao dueinDao;


    /**
     * 添加储值单；先新增储值单在新增储值卡加余额
     * @param memberStored
     * @return
     */
    @Transactional
    @Override
    public Boolean addchuzhi(MemberStored memberStored) {
        try{
            int add = this.memberStoredDao.insert(memberStored);
            System.out.println("添加储值单："+add);
            //执行新增操作如果为1说明新增成功进行判断储值卡是否存在
            if(add == 1){
                //执行查询操作查询储值卡是否存在
                System.out.println("储值卡编号："+memberStored.getSavingsno());
//                Savings savings = this.savingsDao.findbynumber(memberStored.getSavingsno());
//                System.out.println("储值卡："+savings);
                //为0是不存在就新增储值卡信息
                if(this.savingsDao.findbynumber(memberStored.getSavingsno()) == null ){
                    Savings savings1 = new Savings();
                    savings1.setCId(memberStored.getCId());
                    savings1.setCName(memberStored.getCName());
                    savings1.setCPhone(memberStored.getCPhone());
                    savings1.setSavingsno(memberStored.getSavingsno());
                    savings1.setSymony(memberStored.getGiveAmount() + memberStored.getStoredValue());
                    savings1.setSId(memberStored.getSId());
                    savings1.setCjdate(new Date());
                    savings1.setSName(memberStored.getSName());
                    System.out.println("储值卡信息："+savings1.toString());
                    this.savingsDao.insert(savings1);
                    this.memberStoredDao.updatetype("新开",memberStored.getSavingsno());//修改储值单类型不存在就为新开
                }else{
                    this.memberStoredDao.updatetype("充值",memberStored.getSavingsno());//修改储值单类型存在就为充值
                    //如果查询结果为1就增加储值卡余额
                    int money = this.savingsDao.updatemoney(memberStored.getGiveAmount()+memberStored.getStoredValue(),memberStored.getSavingsno());
                }
                //实列化对象，提交财务收款记录
                Duein duein = new Duein();
                duein.setTimeliness(0);//时效性
                duein.setDocumentnumber(memberStored.getBillCode());//收款单编号
                duein.setDocumenttype("储值卡充值");
                duein.setDocumentdate(memberStored.getBillDate());//单据日期
                duein.setRelationship("客户");//往来关系
                duein.setDocumentstatus(1);//收款状态
                duein.setCustomerid(memberStored.getCId());//客户id
                duein.setOrderamount(BigDecimal.valueOf(memberStored.getGiveAmount()+memberStored.getStoredValue()));//本单金额=充值金额+赠送金额
                duein.setRemarks(memberStored.getRemarks());//备注
                duein.setSId(memberStored.getSId());//门店id
                System.out.println("收款单信息："+duein.toString());
                this.dueinDao.insert(duein);//添加一条收款单记录

            }
            return true;
        }catch (Exception e){
//            捕抓异常进行事务回滚操作，新增失败
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            System.out.println("异常处理结果："+e.getMessage());
            return false;
        }
    }

    @Override
    public List<HuiyuanVo> findallbyname(String cName) {
        return this.memberStoredDao.findallbyname(cName);
    }
    /**
     * 查询所有储值单记录
     * @return
     */
    @Override
    public List<HuiyuanVo> findall() {
        List<HuiyuanVo> list = this.memberStoredDao.findall();
        return list;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public MemberStored queryById(Integer mId) {
        return this.memberStoredDao.queryById(mId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<MemberStored> queryAllByLimit(int offset, int limit) {
        return this.memberStoredDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param memberStored 实例对象
     * @return 实例对象
     */
    @Override
    public MemberStored insert(MemberStored memberStored) {
        this.memberStoredDao.insert(memberStored);
        return memberStored;
    }

    /**
     * 修改数据
     *
     * @param memberStored 实例对象
     * @return 实例对象
     */
    @Override
    public MemberStored update(MemberStored memberStored) {
        this.memberStoredDao.update(memberStored);
        return this.queryById(memberStored.getMId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mId) {
        return this.memberStoredDao.deleteById(mId) > 0;
    }
}
