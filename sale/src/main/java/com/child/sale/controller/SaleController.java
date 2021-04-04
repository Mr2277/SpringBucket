package com.child.sale.controller;

import com.child.sale.entity.Sale;
import com.child.sale.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * (Sale)表控制层
 *
 * @author makejava
 * @since 2021-04-04 21:20:16
 */
@RestController
@RequestMapping("sale")
public class SaleController {
    /**
     * 服务对象
     */
    @Autowired
    private SaleService saleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public Sale selectOne(@RequestParam("id") Integer id) {
        return this.saleService.queryById(id);
    }

}