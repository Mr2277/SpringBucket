package com.child.sale.service.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SaleProducer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public void sendMsg(String topic, String msg) {
        log.info("发送报文：" + msg);
        this.rocketMQTemplate.convertAndSend(topic, msg);
    }

    public void sendMsg(String topic, Object obj) {
        rocketMQTemplate.convertAndSend(topic, obj);
    }
}
