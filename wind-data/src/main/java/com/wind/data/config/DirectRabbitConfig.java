package com.wind.data.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * rabbitMq配置
 * @author: HuangYongJie
 * @version: v1.0
 * @since: 2020/2/20 16:11
 **/
@Configuration
public class DirectRabbitConfig {

    @Value("${spring.rabbitmq.queueName}")
    private String queueName;

    @Value("${spring.rabbitmq.directExchange}")
    private String directExchange;

    @Value("${spring.rabbitmq.routingKey}")
    private String routingKey;

    /**
     * 队列 起名：TestDirectQueue
     * @return
     */
    @Bean
    public Queue initDirectQueue() {
        //true 是否持久
        return new Queue(queueName,true);
    }

    /**
     * Direct交换机 起名：TestDirectExchange
     * @return
     */
    @Bean
    public DirectExchange initDirectExchange() {
        return new DirectExchange(directExchange);
    }

    /**
     * 绑定  将队列和交换机绑定, 并设置用于匹配键：TestDirectRouting
     * @return
     */
    @Bean
    public Binding bindingDirect() {
        return BindingBuilder.bind(initDirectQueue()).to(initDirectExchange()).with(routingKey);
    }


}
