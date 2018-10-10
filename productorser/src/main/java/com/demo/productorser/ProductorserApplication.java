package com.demo.productorser;

import com.demo.productorser.kafkademo.annotation.CustomChannels;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard//表盘监控
@EnableHystrix
@EnableCircuitBreaker
@EnableBinding(CustomChannels.class)//自定义通道
//@EnableResourceServer
//@EnableBinding(Source.class)//默认
public class ProductorserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductorserApplication.class, args);
    }
}
