package com.trkj.asms.service.impl;

import com.trkj.asms.dao.DueinDao;
import com.trkj.asms.entity.Duein;
import com.trkj.asms.service.DueinService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class DueinServiceImpl implements DueinService {
    @Autowired
    private DueinDao dueinDao;
    @Override
    public List<Duein> findduein() {
        return dueinDao.findduein();
    }

    @Override
    public List<Duein> findyiduein() {
        return dueinDao.findyiduein();
    }

    @Override
    public Duein adddueinAll(Duein duein) {
        dueinDao.insertSelective(duein);
        return duein;
    }

    @Override
    public Duein deleteduein(Duein record) {
        record.setTimeliness(1);
        dueinDao.updateByPrimaryKeySelective(record);
        return record;
    }
}
