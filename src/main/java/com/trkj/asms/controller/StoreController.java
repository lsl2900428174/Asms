package com.trkj.asms.controller;

import com.trkj.asms.entity.Store;
import com.trkj.asms.service.StoreService;
import com.trkj.asms.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 门店表(Store)表控制层
 *
 * @author lishilong
 * @since 2021-07-11 11:48:06
 */
@RestController
@RequestMapping("store")
public class StoreController {
    /**
     * 服务对象
     */
    @Resource
    private StoreService storeService;

    @Autowired
    private IdWorker idWorker;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Store selectOne(Integer id) {
        return this.storeService.queryById(id);
    }

    /**
     * 查询所有门店数据
     * @return
     */
    @GetMapping("selectAll")
    public List<Store> selectAll(){
        return storeService.selectAll();
    }

    /**
     * 根据门店名称模糊查询
     * @param name
     * @return
     */
    @GetMapping("selectByName")
    public List<Store> selectLikeByName(String name){
        return storeService.selectLikeByName(name);
    }

    @PostMapping("addStore")
    public Store addStore(@RequestBody Store store){
        //自动生成门店编号
        String str = idWorker.nextId()+"";
        store.setSNumber("ASMS"+str.substring(13,19));
        storeService.insert(store);
        return store;
    }
}
