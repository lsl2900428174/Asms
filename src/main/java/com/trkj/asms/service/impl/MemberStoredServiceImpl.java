package com.trkj.asms.service.impl;

import com.trkj.asms.dao.SavingsDao;
import com.trkj.asms.entity.MemberStored;
import com.trkj.asms.dao.MemberStoredDao;
import com.trkj.asms.entity.Savings;
import com.trkj.asms.service.MemberStoredService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
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
            //执行新增操作如果为1说明新增成功进行判断储值卡是否存在
            if(add == 1){
                //执行查询操作查询储值卡是否存在
                int savings = this.savingsDao.findbynumber(memberStored.getSavingsno());
                //为0是不存在就新增储值卡信息
                if(savings == 0){
                    Savings savings1 = new Savings();
                    savings1.setCName(memberStored.getCName());
                    savings1.setCPhone(memberStored.getCPhone());
                    savings1.setSavingsno(memberStored.getSavingsno());
                    savings1.setSymony(memberStored.getGiveAmount() + memberStored.getStoredValue());
                    savings1.setSId(memberStored.getSId());
                    this.savingsDao.insert(savings1);
                }else{
                    //如果查询结果为1就增加储值卡余额
                    int money = this.savingsDao.updatemoney(memberStored.getGiveAmount()+memberStored.getStoredValue(),memberStored.getSavingsno());
                }
                return true;
            }else{
                //不为1就说明新增失败
                return false;
            }
        }catch (Exception e){
            //捕抓异常进行事务回滚操作，新增失败
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            System.out.println(e.getMessage());
            return false;
        }

    }

    /**
     * 查询所有储值单记录
     * @return
     */
    @Override
    public List<MemberStored> findall() {
        return this.memberStoredDao.findall();
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
