package com.trkj.asms.service.impl;

import com.trkj.asms.dao.PendingpaymentDao;
import com.trkj.asms.entity.Pendingpayment;
import com.trkj.asms.service.PendingpaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PendingpaymentServiceImpl implements PendingpaymentService {
    @Autowired
    private PendingpaymentDao pendingpaymentDao;
    @Override
    public List<Pendingpayment> findAllpending() {
        return pendingpaymentDao.selectAll();
    }

    @Override
    public List<Pendingpayment> findyiAll() {
        return pendingpaymentDao.selectyiAll();
    }

    @Override
    public Pendingpayment Addpending(Pendingpayment pendingpayment) {
        pendingpaymentDao.insertSelective(pendingpayment);
        return pendingpayment;
    }

    @Override
    public Pendingpayment updatestatus(Pendingpayment pendingpayment) {
//        改未已付款
        pendingpayment.setDocumentstatus(1);
        pendingpaymentDao.updateByPrimaryKeySelective(pendingpayment);
        return pendingpayment;
    }

    @Override
    public List<Pendingpayment> findmohuNameAndId(String documentnumber, String s_name) {
        return pendingpaymentDao.selectmohu(documentnumber, s_name);
    }

    @Override
    public List<Pendingpayment> findyimohuNameAndId(String documentnumber, String documenttype) {
        return pendingpaymentDao.selectyimohu(documentnumber, documenttype);
    }
}
