package com.demo.productorser.kafkademo.annotation;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

//自定义消息通道output
public interface CustomChannels {

    String OUT_OUTPUT = "outboundOrgChanges";

    String OUT_OUTPUT2 = "outboundOrgChanges2";
    /**
     * 发消息的通道
     *
     * @return
     */
    @Output(OUT_OUTPUT)
    MessageChannel sendMessage();

    @Output(OUT_OUTPUT2)
    MessageChannel sendMessage2();
}
