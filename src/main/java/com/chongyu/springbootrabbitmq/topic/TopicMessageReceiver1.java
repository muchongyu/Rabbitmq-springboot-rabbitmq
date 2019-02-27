package com.chongyu.springbootrabbitmq.topic;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.message")
public class TopicMessageReceiver1 {

    @RabbitHandler
    public void process(String msg){
        System.out.println("topicMessageReceiver  : " +msg);
    }
}
