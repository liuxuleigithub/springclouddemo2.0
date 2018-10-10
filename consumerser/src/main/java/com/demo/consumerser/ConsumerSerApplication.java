package com.demo.consumerser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableHystrix
@EnableCircuitBreaker
@EnableSwagger2
//@EnableResourceServer
//@EnableOAuth2Client
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableBinding(CustomChannels.class)    //自定义接收通道
//@EnableBinding(Sink.class)    //默认接收
public class ConsumerSerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerSerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSerApplication.class, args);
    }




}
