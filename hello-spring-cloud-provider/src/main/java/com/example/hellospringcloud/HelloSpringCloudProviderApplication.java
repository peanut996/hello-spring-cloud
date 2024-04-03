package com.example.hellospringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.hellospringcloud.*")
@SpringBootApplication
public class HelloSpringCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudProviderApplication.class, args);
    }

}
