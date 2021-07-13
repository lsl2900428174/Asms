package com.trkj.asms.controller;

import com.trkj.asms.entity.Color;
import com.trkj.asms.entity.Commodity;
import com.trkj.asms.service.CommodityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class CommodityController {
    @Resource
    private CommodityService commodityService;
    @GetMapping("selectBycommodity")
    public List<Commodity> selectBycommodity() {
        return commodityService.selectBycommodity();
    }
}
