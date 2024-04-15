package com.msatest.msatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsatestApplication.class, args);
	}

}
