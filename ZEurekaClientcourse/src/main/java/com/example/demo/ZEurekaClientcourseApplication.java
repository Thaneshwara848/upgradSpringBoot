package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZEurekaClientcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZEurekaClientcourseApplication.class, args);
		System.out.println("Eureka Clinet Course is Running");
	}

}
