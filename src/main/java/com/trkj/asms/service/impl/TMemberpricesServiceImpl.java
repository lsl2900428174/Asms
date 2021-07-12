package com.trkj.asms.service.impl;

import com.trkj.asms.entity.TMemberprices;
import com.trkj.asms.dao.TMemberpricesDao;
import com.trkj.asms.service.TMemberpricesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TMemberprices)表服务实现类
 *
 * @author makejava
 * @since 2021-07-12 11:02:27
 */
@Service("tMemberpricesService")
public class TMemberpricesServiceImpl implements TMemberpricesService {
    @Resource
    private TMemberpricesDao tMemberpricesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param mId 主键
     * @return 实例对象
     */
    @Override
    public TMemberprices queryById(Integer mId) {
        return this.tMemberpricesDao.queryById(mId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TMemberprices> queryAllByLimit(int offset, int limit) {
        return this.tMemberpricesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tMemberprices 实例对象
     * @return 实例对象
     */
    @Override
    public Boolean insert(TMemberprices tMemberprices) {
        int add = this.tMemberpricesDao.insert(tMemberprices);
        if(add >0){
            return true;
        }
        return false;
    }

    /**
     * 修改数据
     *
     * @param tMemberprices 实例对象
     * @return 实例对象
     */
    @Override
    public TMemberprices update(TMemberprices tMemberprices) {
        this.tMemberpricesDao.update(tMemberprices);
        return this.queryById(tMemberprices.getMId());
    }

    /**
     * 通过主键删除数据
     *
     * @param mId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mId) {
        return this.tMemberpricesDao.deleteById(mId) > 0;
    }
}
