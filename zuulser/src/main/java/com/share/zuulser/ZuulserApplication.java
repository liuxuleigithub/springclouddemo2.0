package com.share.zuulser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy//开启zuul路由
//@EnableOAuth2Sso
public class ZuulserApplication {


    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//    //Annotation方式  权重方式均衡
//    @Bean
//    public IRule ribbonRule() {
//        return new WeightedResponseTimeRule();
//    }


    public static void main(String[] args) {
        SpringApplication.run(ZuulserApplication.class, args);
    }
}
