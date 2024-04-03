package com.example.hellospringcloud.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class ConsumerController {


    private final RestTemplate restTemplate;

    @Value("${service-url.hello-spring-cloud-provider}")
    private String provider;

    @RequestMapping(value="/ribbon-consumer", method = RequestMethod.GET)
    public String userConsumer() {
        return restTemplate.getForEntity(provider + "/users", String.class).getBody();
    }
}