package com.trkj.asms.service.impl;

import com.trkj.asms.dao.CommodityDao;
import com.trkj.asms.entity.Commodity;
import com.trkj.asms.service.CommodityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
@RestController
@Slf4j
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityDao commodityDao;
    @Override
    public List<Commodity> selectBycommodity() {
        return commodityDao.selectBycommodity();
    }
}
