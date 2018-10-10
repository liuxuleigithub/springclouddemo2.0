package com.share.eurakeser.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceRenewListener implements ApplicationListener<EurekaInstanceRenewedEvent> {
    private static final Logger logger = LoggerFactory.getLogger(InstanceRegisterListener.class);
    @Override
    public void onApplicationEvent(EurekaInstanceRenewedEvent eurekaInstanceRenewedEvent) {
        logger.info("心跳检测服务：{}" ,eurekaInstanceRenewedEvent.getInstanceInfo().getAppName());
    }
}
