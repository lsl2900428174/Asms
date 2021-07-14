package com.trkj.asms.service;

import com.trkj.asms.entity.Refundorder;

import java.util.List;

public interface RefundorderService {
    List<Refundorder> findRefundorder();
    Refundorder addRefundorder(Refundorder refundorder);
}
