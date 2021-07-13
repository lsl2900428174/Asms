package com.trkj.asms.service.impl;

import com.trkj.asms.dao.CarwaslistDao;
import com.trkj.asms.entity.Carwaslist;
import com.trkj.asms.service.CarwaslistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CarwashlikeServiceImpl implements CarwaslistService {
    @Resource
    private CarwaslistDao carwaslistDao;
    @Override
    public List<Carwaslist> selectAllCarwashlike(String name) {
        return carwaslistDao.selectAllCarwashlike(name);
    }

    @Override
    public Carwaslist insertCarwaslist(Carwaslist carwaslist) {
        carwaslistDao.insertCarwaslist(carwaslist);
        return carwaslist;
    }

    @Override
    public Carwaslist updateAllCarwaslist(Carwaslist carwaslist) {
        carwaslistDao.updateAllCarwaslist(carwaslist);
        return carwaslist;
    }

    @Override
    public Carwaslist updateCarwaslistSta(Carwaslist carwaslist) {
        carwaslistDao.updateCarwaslistSta(carwaslist);
        return carwaslist;
    }
}
