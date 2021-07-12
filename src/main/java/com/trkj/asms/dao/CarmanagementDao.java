package com.trkj.asms.dao;

import com.trkj.asms.entity.Carmanagement;
import com.trkj.asms.vo.CheliangVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 车辆管理表(Carmanagement)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-12 00:38:34
 */
@Mapper
public interface CarmanagementDao {
    List<Carmanagement> findall2();
    /**
     * 查看车辆资料的所有数据
     * @return
     */
    List<CheliangVo> findall();
    /**
     * 通过ID查询单条数据
     *
     * @param carmagid 主键
     * @return 实例对象
     */
    Carmanagement queryById(Integer carmagid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Carmanagement> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carmanagement 实例对象
     * @return 对象列表
     */
    List<Carmanagement> queryAll(Carmanagement carmanagement);

    /**
     * 新增数据
     *
     * @param carmanagement 实例对象
     * @return 影响行数
     */
    int insert(Carmanagement carmanagement);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Carmanagement> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Carmanagement> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Carmanagement> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Carmanagement> entities);

    /**
     * 修改数据
     *
     * @param carmanagement 实例对象
     * @return 影响行数
     */
    int update(Carmanagement carmanagement);

    /**
     * 通过主键删除数据
     *
     * @param carmagid 主键
     * @return 影响行数
     */
    int deleteById(Integer carmagid);

}

