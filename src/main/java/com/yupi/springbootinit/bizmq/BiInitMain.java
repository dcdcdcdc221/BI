package com.yupi.springbootinit.bizmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class BiInitMain {
    public static void main(String[] args) {
        try{
            //创建连接工厂
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("118.25.27.171");
            factory.setVirtualHost("/");
            factory.setUsername("admin");
            factory.setPassword("123456");
            //创建连接
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            String EXCHANGE_NAME = BiMqConstant.BI_EXCHANGE;
            channel.exchangeDeclare(EXCHANGE_NAME,"direct");
            String queueName = BiMqConstant.BI_QUEUE_NAME;
            channel.queueDeclare(queueName,true,false,false,null);
            channel.queueBind(queueName,EXCHANGE_NAME,BiMqConstant.BI_ROUTING_KEY);
        }catch (Exception e){
        }


    }
}
