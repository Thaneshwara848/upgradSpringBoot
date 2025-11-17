package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZEurekaClientEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZEurekaClientEmployeeApplication.class, args);
		System.out.println("Employee Server runnig...");
	}

}
