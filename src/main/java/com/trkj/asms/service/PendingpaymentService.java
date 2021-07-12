package com.trkj.asms.service;

import com.trkj.asms.entity.Pendingpayment;

import java.util.List;

public interface PendingpaymentService {
    List<Pendingpayment> findAllpending();
    Pendingpayment Addpending(Pendingpayment pendingpayment);
    Pendingpayment updatestatus(Pendingpayment pendingpayment);
}
