package com.sn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShoppigTest3Application {

	public static void main(String[] args) {
		SpringApplication.run(ShoppigTest3Application.class, args);
	}

}
