package com.demo.productorser.kafkademo.source;


import com.demo.productorser.kafkademo.annotation.CustomChannels;
import com.demo.productorser.bean.UserMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;


@Component
public class SourceBean {
//    private Source source;
    private CustomChannels customChannels;

    private static final Logger logger = LoggerFactory.getLogger(SourceBean.class);

//    @Autowired
//    public SourceBean(Source source){
//        this.source = source;
//    }

    @Autowired
    public SourceBean(CustomChannels customChannels){
        this.customChannels = customChannels;
    }

//    public void defaultPublish(String message,String orgId,String action){
//        logger.info("defult Sending Kafka message {}", action, orgId);
//        UserMessage change =  new UserMessage(
//                message,
//                orgId,
//                action);
//
//        source.output().send(MessageBuilder.withPayload(change).build());
//    }

    //通过自定义消息通道发送消息
    public void customPublish(String message,String orgId, String action){

        logger.info("custom Sending Kafka message {}", action, orgId);
        UserMessage change =  new UserMessage(
                message,
                orgId,
                action);

        customChannels.sendMessage().send(MessageBuilder.withPayload(change).build());
    }

    public void customPublish2(String message ,String orgId,String action){
       logger.info("custom2 Sending Kafka message {}", action, orgId);
        UserMessage change =  new UserMessage(
                message,
                orgId,
                action);

        customChannels.sendMessage2().send(MessageBuilder.withPayload(change).build());
    }
}
