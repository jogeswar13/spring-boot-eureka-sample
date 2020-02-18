package com.jogi.springeurekaclientstudentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringEurekaClientStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientStudentServiceApplication.class, args);
	}

}
