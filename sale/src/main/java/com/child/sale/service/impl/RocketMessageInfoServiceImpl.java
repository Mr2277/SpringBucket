package com.child.sale.service.impl;

import com.child.sale.entity.RocketMessageInfo;
import com.child.sale.dao.RocketMessageInfoDao;
import com.child.sale.service.RocketMessageInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (RocketMessageInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-04-06 20:15:29
 */
@Service("rocketMessageInfoService")
public class RocketMessageInfoServiceImpl implements RocketMessageInfoService {
    @Resource
    private RocketMessageInfoDao rocketMessageInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public RocketMessageInfo queryById(Object id) {
        return this.rocketMessageInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<RocketMessageInfo> queryAllByLimit(int offset, int limit) {
        return this.rocketMessageInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param rocketMessageInfo 实例对象
     * @return 实例对象
     */
    @Override
    public RocketMessageInfo insert(RocketMessageInfo rocketMessageInfo) {
        this.rocketMessageInfoDao.insert(rocketMessageInfo);
        return rocketMessageInfo;
    }

    /**
     * 修改数据
     *
     * @param rocketMessageInfo 实例对象
     * @return 实例对象
     */
    @Override
    public RocketMessageInfo update(RocketMessageInfo rocketMessageInfo) {
        this.rocketMessageInfoDao.update(rocketMessageInfo);
        return this.queryById(rocketMessageInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.rocketMessageInfoDao.deleteById(id) > 0;
    }


    @Override
    public Page<RocketMessageInfo> selectAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return rocketMessageInfoDao.queryAll(null);
    }
}