package com.child.sale.service.rocketmq;

import com.child.sale.entity.ShoppingFlow;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(topic = "sale", consumerGroup = "sale_consumer")
public class SaleConsumer implements RocketMQListener<ShoppingFlow> {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void onMessage(ShoppingFlow shoppingFlow) {
        System.out.println(shoppingFlow.getBill());
        System.out.println(shoppingFlow.getDeptName());
        System.out.println(shoppingFlow.getNumSale());
    }
}
