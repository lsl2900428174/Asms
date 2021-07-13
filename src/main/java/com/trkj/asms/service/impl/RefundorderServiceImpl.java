package com.trkj.asms.service.impl;

import com.trkj.asms.dao.RefundorderDao;
import com.trkj.asms.entity.Refundorder;
import com.trkj.asms.service.RefundorderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class RefundorderServiceImpl implements RefundorderService {
    @Autowired
    private RefundorderDao refundorderDao;
    @Override
    public List<Refundorder> findRefundorder() {
        return refundorderDao.selectByPrimaryKey();
    }

    @Override
    public Refundorder addRefundorder(Refundorder refundorder) {
        refundorderDao.insertSelective(refundorder);
        return refundorder;
    }
}
