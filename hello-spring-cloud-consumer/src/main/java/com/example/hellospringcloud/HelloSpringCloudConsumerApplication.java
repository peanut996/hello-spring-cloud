package com.example.hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
public class HelloSpringCloudConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudConsumerApplication.class, args);
    }

}
