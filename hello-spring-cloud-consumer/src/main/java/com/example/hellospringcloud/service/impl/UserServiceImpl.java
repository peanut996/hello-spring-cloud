package com.example.hellospringcloud.service.impl;

import com.example.hellospringcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final RestTemplate restTemplate;

    @Value("${service-url.hello-spring-cloud-provider}")
    private String provider;

    @Override
    @HystrixCommand(fallbackMethod = "getDefaultUsers", commandProperties = {@HystrixProperty(name = "fallback.enabled", value = "true")})
    public String getUsers() {
        log.info("开始调用");
        return restTemplate.getForEntity(provider + "/users", String.class).getBody();
    }


    public String getDefaultUsers() {
        log.info("服务降级");
        return "defaultUsers";
    }
}
