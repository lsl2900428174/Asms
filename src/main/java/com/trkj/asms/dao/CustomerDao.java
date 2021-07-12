package com.trkj.asms.dao;

import com.trkj.asms.entity.Customer;
import com.trkj.asms.vo.KehuVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 客户表(Customer)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-11 19:58:57
 */
@Mapper
public interface CustomerDao {

    List<KehuVo> findall();

    List<Customer> findall2();
    /**
     * 通过ID查询单条数据
     *
     * @param cId 主键
     * @return 实例对象
     */
    Customer queryById(Integer cId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Customer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param customer 实例对象
     * @return 对象列表
     */
    List<Customer> queryAll(Customer customer);

    /**
     * 新增数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    int insert(Customer customer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Customer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Customer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Customer> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Customer> entities);

    /**
     * 修改数据
     *
     * @param customer 实例对象
     * @return 影响行数
     */
    int update(Customer customer);

    /**
     * 通过主键删除数据
     *
     * @param cId 主键
     * @return 影响行数
     */
    int deleteById(Integer cId);

}

