package com.trkj.asms.service.impl;

import com.trkj.asms.dao.MainbillingDao;
import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MainbillingServiceImpl implements MainbillingService {
    @Resource
    private MainbillingDao mainbillingDao;
    @Override
    public List<Mainbilling> selectMainbilling() {
        return mainbillingDao.selectMainbilling();
    }

    @Override
    public Mainbilling insertMainbilling(Mainbilling mainbilling) {
        mainbillingDao.insertMainbilling(mainbilling);
        return mainbilling;
    }

    @Override
    public Mainbilling updateMainbilling(Mainbilling mainbilling) {
        mainbillingDao.updateMainbilling(mainbilling);
        return mainbilling;
    }
}
