package com.jogi.springeurekaserverservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerServiceApplication.class, args);
	}

}
