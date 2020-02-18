package com.jogi.springeurekaclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringEurekaClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientServiceApplication.class, args);
	}

}
