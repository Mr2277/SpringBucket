package com.child.sale.entity;

import org.springframework.stereotype.Component;

import java.lang.Object;
import java.io.Serializable;

/**
 * (RocketMessageInfo)实体类
 *
 * @author makejava
 * @since 2021-04-06 20:15:29
 */
@Component
public class RocketMessageInfo implements Serializable {
    private static final long serialVersionUID = -43004714347106599L;
    
    private Object id;
    
    private Integer queueId;
    
    private String messageBody;
    
    private String createTime;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}