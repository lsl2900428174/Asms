package com.trkj.asms.service;

import com.trkj.asms.entity.Mainbilling;

import java.util.List;

public interface MainbillingService {
    List<Mainbilling> selectMainbilling();
    Mainbilling insertMainbilling(Mainbilling mainbilling);
    Mainbilling updateMainbilling(Mainbilling mainbilling);
}
