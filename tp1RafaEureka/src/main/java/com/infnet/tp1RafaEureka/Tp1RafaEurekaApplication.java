package com.infnet.tp1RafaEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tp1RafaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp1RafaEurekaApplication.class, args);
	}

}
