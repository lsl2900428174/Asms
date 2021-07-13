package com.trkj.asms.controller;

import com.trkj.asms.dao.WReturnedmaterialsDao;
import com.trkj.asms.entity.WDeliveryorder;
import com.trkj.asms.entity.WMaterialorder;
import com.trkj.asms.entity.WReturnedmaterials;
import com.trkj.asms.service.WDeliveryorderService;
import com.trkj.asms.service.WReturnedmaterialsService;
import com.trkj.asms.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 物资采购退货出库单(WDeliveryorder)表控制层
 *
 * @author makejava
 * @since 2021-07-11 10:59:38
 */
@RestController
@RequestMapping("wDeliveryorder")
public class WDeliveryorderController {
    /**
     * 服务对象
     */
    @Resource
    private WDeliveryorderService wDeliveryorderService;
    @Resource
    private WReturnedmaterialsService wReturnedmaterialsService;

    /**
     * 新增出库记录
     */
    @PostMapping("insert")
    public AjaxResponse insert(@RequestBody WDeliveryorder wDeliveryorder){
        String message = "";
        Boolean add = wDeliveryorderService.insert(wDeliveryorder);
        if(add == true){
            message = "新增成功";
        }else{
            message = "新增失败";
        }
        return AjaxResponse.success(message);
    }

    /**
     * 查询出库记录
     */
    @GetMapping("selectAll")
    public AjaxResponse selectAll(){
        List<WDeliveryorder> wDeliveryorders = wDeliveryorderService.queryAllByLimit(1,10);
        for (WDeliveryorder item:wDeliveryorders) {
            WReturnedmaterials wReturnedmaterials = new WReturnedmaterials();

            wReturnedmaterials.setBillcode(item.getBillcode());
            List<WReturnedmaterials> list = wReturnedmaterialsService.queryAll(wReturnedmaterials);
            item.setWReturnedmaterials(list);
        }
        return AjaxResponse.success(wDeliveryorders);
    }

}
