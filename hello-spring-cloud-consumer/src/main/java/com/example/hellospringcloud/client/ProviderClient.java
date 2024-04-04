package com.example.hellospringcloud.client;


import com.example.hellospringcloud.client.fallback.ProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "hello-spring-cloud-provider",fallback = ProviderClientFallback.class)
public interface ProviderClient {
    @GetMapping(value = "/users")
    String getUsers();
}
