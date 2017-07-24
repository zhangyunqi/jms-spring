package com.zyq.jms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by 11963 on 2017/7/24.
 */
public class ConsumerMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try{
            System.out.println("接收消息：" + textMessage.getText());
        }catch (JMSException e){
            e.printStackTrace();
        }

    }
}
