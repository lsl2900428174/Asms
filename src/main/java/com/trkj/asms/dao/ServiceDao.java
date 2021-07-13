package com.trkj.asms.dao;

import com.trkj.asms.entity.Service;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 维修类型表(Service)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 09:28:34
 */
@Mapper
public interface ServiceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    List<Service> queryById();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Service> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param service 实例对象
     * @return 对象列表
     */
    List<Service> queryAll(Service service);

    /**
     * 新增数据
     *
     * @param service 实例对象
     * @return 影响行数
     */
    int insert(Service service);

    /**
     * 修改数据
     *
     * @param service 实例对象
     * @return 影响行数
     */
    int update(Service service);

    /**
     * 通过主键删除数据
     *
     * @param serviceid 主键
     * @return 影响行数
     */
    int deleteById(Integer serviceid);

}