package com.example.hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HelloSpringCloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudEurekaServerApplication.class, args);
    }
}
