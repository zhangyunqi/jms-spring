package com.zyq.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 11963 on 2017/7/21.
 */
public class AppProducer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = context.getBean(ProducerService.class);
        for (int i = 0; i <= 10; i++) {
            producerService.sendMessage("消息"+i);
        }

    }


}
