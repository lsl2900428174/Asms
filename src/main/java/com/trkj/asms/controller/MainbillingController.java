package com.trkj.asms.controller;

import com.trkj.asms.entity.Mainbilling;
import com.trkj.asms.service.MainbillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MainbillingController {
    @Autowired
    private MainbillingService mainbillingService;
    @GetMapping("/selectMainbilling")
    public List<Mainbilling> selectMainbilling(){
        List<Mainbilling> findSourcePage = mainbillingService.selectMainbilling();
        return findSourcePage;
    }
}
