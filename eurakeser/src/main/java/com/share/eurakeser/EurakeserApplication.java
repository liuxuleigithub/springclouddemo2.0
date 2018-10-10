package com.share.eurakeser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakeserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakeserApplication.class, args);
	}
}
