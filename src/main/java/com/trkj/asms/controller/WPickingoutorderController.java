package com.trkj.asms.controller;

import com.trkj.asms.entity.WDeliveryorder;
import com.trkj.asms.entity.WPickingoutorder;
import com.trkj.asms.entity.WReturnedmaterials;
import com.trkj.asms.service.WPickingoutorderService;
import com.trkj.asms.service.WReturnedmaterialsService;
import com.trkj.asms.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 维修领料出库单(WPickingoutorder)表控制层
 *
 * @author makejava
 * @since 2021-07-12 13:29:19
 */
@RestController
@RequestMapping("wPickingoutorder")
public class WPickingoutorderController {
    /**
     * 服务对象
     */
    @Resource
    private WPickingoutorderService wPickingoutorderService;
    @Resource
    private WReturnedmaterialsService wReturnedmaterialsService;

    /**
     * 新增维修出库记录
     */
    @PostMapping("insert")
    public AjaxResponse insert(@RequestBody WPickingoutorder wPickingoutorder){
        String message = "";
        Boolean add = wPickingoutorderService.insert(wPickingoutorder);
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
        List<WPickingoutorder> wPickingoutorder = wPickingoutorderService.queryAllByLimit(0,10);
        System.out.println(wPickingoutorder.toString());
        for (WPickingoutorder item:wPickingoutorder) {
            WReturnedmaterials wReturnedmaterials = new WReturnedmaterials();

            wReturnedmaterials.setBillcode(item.getBillcode());
            List<WReturnedmaterials> list = wReturnedmaterialsService.queryAll(wReturnedmaterials);
            item.setWReturnedmaterials(list);
        }
        return AjaxResponse.success(wPickingoutorder);
    }

}
