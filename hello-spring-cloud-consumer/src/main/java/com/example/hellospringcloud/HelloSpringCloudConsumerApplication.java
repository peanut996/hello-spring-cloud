package com.example.hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@RemoteApplicationEventScan
public class HelloSpringCloudConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudConsumerApplication.class, args);
    }

}
