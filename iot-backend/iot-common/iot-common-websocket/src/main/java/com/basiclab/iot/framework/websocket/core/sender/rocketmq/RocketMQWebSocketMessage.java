package com.basiclab.iot.framework.websocket.core.sender.rocketmq;

import lombok.Data;

/**
 * RocketMQ 广播 WebSocket 的消息
 *
 * @author BasicLab源码
 */
@Data
public class RocketMQWebSocketMessage {

    /**
     * Session 编号
     */
    private String sessionId;
    /**
     * 用户类型
     */
    private Integer userType;
    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 消息类型
     */
    private String messageType;
    /**
     * 消息内容
     */
    private String messageContent;

}
