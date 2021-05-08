package com.child.sale.service.impl;

import com.child.sale.entity.Sale;
import com.child.sale.dao.SaleDao;
import com.child.sale.entity.ShoppingFlow;
import com.child.sale.service.SaleService;
import com.child.sale.service.rocketmq.SaleProducer;
import com.child.sale.utils.SerializeUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * (Sale)表服务实现类
 *
 * @author makejava
 * @since 2021-04-04 21:20:15
 */
@Service("saleService")
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleDao saleDao;

    @Autowired
    private SaleProducer producer;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Sale queryById(Object id) {
        return this.saleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Sale> queryAllByLimit(int offset, int limit) {
        List<Sale> sales = saleDao.queryAllByLimit(offset, limit);
        List<ShoppingFlow> shoppingFlows = sales.stream().map(sale -> transfor(sale))
                .collect(Collectors.toList());
        for (ShoppingFlow shoppingFlow : shoppingFlows) {
            producer.sendMsg("sale", shoppingFlow);
        }
        return sales;
    }

    public ShoppingFlow transfor(Sale sale) {
        ShoppingFlow shoppingFlow = new ShoppingFlow();
        shoppingFlow.setBill(sale.getBill());
        shoppingFlow.setDeptId(sale.getDeptid());
        shoppingFlow.setDeptName(sale.getDeptname());
        shoppingFlow.setNumSale(sale.getNumSale());
        shoppingFlow.setStandards(sale.getStandards());
        shoppingFlow.setValueSale(sale.getValueSale());
        shoppingFlow.setVipId(sale.getVipid());
        return shoppingFlow;
    }


    /**
     * 新增数据
     *
     * @param sale 实例对象
     * @return 实例对象
     */
    @Override
    public Sale insert(Sale sale) {
        this.saleDao.insert(sale);
        return sale;
    }

    /**
     * 修改数据
     *
     * @param sale 实例对象
     * @return 实例对象
     */
    @Override
    public Sale update(Sale sale) {
        this.saleDao.update(sale);
        return this.queryById(sale.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.saleDao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<Sale> selectByPage(Integer pageSize, Integer pageNo) {
        PageHelper.startPage(pageNo, pageSize);
        List<Sale> sales = saleDao.selectByPage();
        PageInfo<Sale> pageInfo = new PageInfo<>(sales);
        return pageInfo;
    }

    @Override
    public String test() {
        return "test";
    }
}