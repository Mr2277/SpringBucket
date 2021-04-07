package com.child.sale.controller;

import com.child.sale.entity.RocketMessageInfo;
import com.child.sale.service.RocketMessageInfoService;
import com.child.sale.service.rocketmq.SaleProducer;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (RocketMessageInfo)表控制层
 *
 * @author makejava
 * @since 2021-04-06 20:15:29
 */
@RestController
@RequestMapping("rocketMessageInfo")
public class RocketMessageInfoController {
    /**
     * 服务对象
     */
    @Resource
    private RocketMessageInfoService rocketMessageInfoService;

    @Autowired
    private SaleProducer saleProducer;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public RocketMessageInfo selectOne(@RequestParam("id") Object id) {
        return this.rocketMessageInfoService.queryById(id);
    }

    @GetMapping("/selectAll")
    public Page<RocketMessageInfo> selectAll(@RequestParam("pageNo") Integer pageNo, @RequestParam("pageSize") Integer pageSize) {
        return rocketMessageInfoService.selectAll(pageNo, pageSize);
    }

    @GetMapping("/producer")
    public String sendMessage(@RequestParam("topic") String topic, @RequestParam("msg") String msg) {
        saleProducer.sendMsg(topic, msg);
        return "success";
    }

}