package com.wind.data.direct;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 推广日志队列监听
 * @author: HuangYongJie
 * @version: v1.0
 * @since: 2020/2/20 16:26
 **/
@Component
@RabbitListener(queues = "advertQueue")//监听的队列名称 TestDirectQueue
public class AdvertLogReceiver {


    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
    }




}
