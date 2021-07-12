package com.trkj.asms.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.trkj.asms.entity.PageResult;
import com.trkj.asms.entity.Stock2;
import com.trkj.asms.entity.WMaterialorder;
import com.trkj.asms.entity.WReturnedmaterials;
import com.trkj.asms.service.Stock2Service;
import com.trkj.asms.service.WMaterialorderService;
import com.trkj.asms.service.WReturnedmaterialsService;
import com.trkj.asms.vo.AjaxResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 物资采购订单表和库存表(WMaterialorder)表控制层
 *
 * @author makejava
 * @since 2021-07-11 20:23:17
 */
@RestController
@RequestMapping("wMaterialorder")
public class WMaterialorderController {
    /**
     * 服务对象
     */
    @Resource
    private WMaterialorderService wMaterialorderService;
    @Resource
    private Stock2Service stock2Service;
    @Resource
    private WReturnedmaterialsService wReturnedmaterialsService;

    /**
     * 新增采购物资记录
     */
    @PostMapping("insertpurchase")
    public AjaxResponse insertpurchase(@RequestBody WMaterialorder wMaterialorder){
        String message = "";
            System.out.println(wMaterialorder.toString());
            System.out.println(wMaterialorder.getWReturnedmaterials().toString());
            Boolean add = wMaterialorderService.insert(wMaterialorder);
            if(add == true){
                message = "新增成功";
            }else{
                message = "新增失败";
            }
        return AjaxResponse.success(message);
    }

    /**
     * 查询采购记录
     */
    @GetMapping("selectallpurchase")
    public AjaxResponse selectallpurchase(){
        List<WMaterialorder> wMaterialorders = wMaterialorderService.queryAllByLimit(1,10);
        for (WMaterialorder item:wMaterialorders) {
            WReturnedmaterials wReturnedmaterials = new WReturnedmaterials();

            wReturnedmaterials.setBillcode(item.getBillcode());
            List<WReturnedmaterials> list = wReturnedmaterialsService.queryAll(wReturnedmaterials);
            item.setWReturnedmaterials(list);
        }
        return AjaxResponse.success(wMaterialorders);
    }

    /**
     * 查询库存所有物资商品
     */
    @GetMapping("selectstock")
    public AjaxResponse selectstock(){

        PageHelper.startPage(1,10);
        List<Stock2> stock2 = stock2Service.selectAll();
        PageInfo<Stock2> pageInfo = new PageInfo<>(stock2);
        PageResult<Stock2> result = new PageResult<>(pageInfo.getTotal(),stock2);

        System.out.println(stock2.get(0).toString());

        return AjaxResponse.success(result);
    }

}
