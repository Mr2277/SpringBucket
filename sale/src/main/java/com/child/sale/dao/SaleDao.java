package com.child.sale.dao;

import com.child.sale.entity.Sale;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Sale)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-04 21:20:14
 */
@Mapper
public interface SaleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sale queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sale> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sale 实例对象
     * @return 对象列表
     */
    List<Sale> queryAll(Sale sale);

    /**
     * 新增数据
     *
     * @param sale 实例对象
     * @return 影响行数
     */
    int insert(Sale sale);

    /**
     * 修改数据
     *
     * @param sale 实例对象
     * @return 影响行数
     */
    int update(Sale sale);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    Page<Sale> selectByPage();

}