package com.child.sale.service;

import com.child.sale.entity.Sale;
import com.child.sale.entity.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Sale)表服务接口
 *
 * @author makejava
 * @since 2021-04-04 21:20:15
 */
public interface SaleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Sale queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sale> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sale 实例对象
     * @return 实例对象
     */
    Sale insert(Sale sale);

    /**
     * 修改数据
     *
     * @param sale 实例对象
     * @return 实例对象
     */
    Sale update(Sale sale);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

    /**
     * 分页查询
     *
     * @param pageSize 当前页大小
     * @param pageNo 当前页号
     * @return 是否成功
     */
    PageInfo<Sale> selectByPage(Integer pageSize, Integer pageNo);

    String test();

    User insertUser(User user);
}