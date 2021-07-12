package com.trkj.asms.service;

import com.trkj.asms.entity.Pendingpayment;

import java.util.List;

public interface PendingpaymentService {
    List<Pendingpayment> findAllpending();
    List<Pendingpayment> findyiAll();
    Pendingpayment Addpending(Pendingpayment pendingpayment);
    Pendingpayment updatestatus(Pendingpayment pendingpayment);
    List<Pendingpayment> findmohuNameAndId(String documentnumber,String s_name);
    List<Pendingpayment> findyimohuNameAndId(String documentnumber,String documenttype);
}
