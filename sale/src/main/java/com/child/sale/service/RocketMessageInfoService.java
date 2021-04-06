package com.child.sale.service;

import com.child.sale.entity.RocketMessageInfo;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * (RocketMessageInfo)表服务接口
 *
 * @author makejava
 * @since 2021-04-06 20:15:29
 */
public interface RocketMessageInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    RocketMessageInfo queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<RocketMessageInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param rocketMessageInfo 实例对象
     * @return 实例对象
     */
    RocketMessageInfo insert(RocketMessageInfo rocketMessageInfo);

    /**
     * 修改数据
     *
     * @param rocketMessageInfo 实例对象
     * @return 实例对象
     */
    RocketMessageInfo update(RocketMessageInfo rocketMessageInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

    Page<RocketMessageInfo> selectAll(Integer pageNo, Integer pageSize);

}