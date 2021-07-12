package com.trkj.asms.controller;

import com.trkj.asms.entity.MemberStored;
import com.trkj.asms.service.MemberStoredService;
import com.trkj.asms.vo.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (MemberStored)表控制层
 *
 * @author makejava
 * @since 2021-07-12 02:38:44
 */
@RestController
@RequestMapping("memberStored")
public class MemberStoredController {
    /**
     * 服务对象
     */
    @Resource
    private MemberStoredService memberStoredService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public MemberStored selectOne(Integer id) {
        return this.memberStoredService.queryById(id);
    }

    /**
     * 储值历史单记录
     * @return
     */
    @GetMapping("findall")
    public List<MemberStored> findall(){
        return this.memberStoredService.findall();
    }

    /**
     * 添加储值单记录
     * @param memberStored
     * @return
     */
    @PostMapping("addchuzhi")
    public AjaxResponse addzhuzhi(@RequestBody MemberStored memberStored){
        String message="";
        Boolean add = this.memberStoredService.addchuzhi(memberStored);
        if(add == true){
            message = "新增成功";
        }else {
            message = "新增失败";
        }
        return AjaxResponse.success(message);
    }

}
