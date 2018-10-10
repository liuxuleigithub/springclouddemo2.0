package com.demo.consumerser.kafkademo.annotation;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

//自定义消息通道input
public interface CustomChannels {



    String IN_INPUT = "inboundOrgChanges";

    String IN_INPUT2 = "inboundOrgChanges2";
    /*
    *
    * 接受消息通道
    * */
    @Input(IN_INPUT)
    SubscribableChannel orgs();
/*
    *
    * 接受消息通道
    * */
    @Input(IN_INPUT2)
    SubscribableChannel orgs2();

}
