package com.example.hellospringcloud.client.fallback;

import com.example.hellospringcloud.client.ProviderClient;
import org.springframework.stereotype.Component;


@Component
public class ProviderClientFallback implements ProviderClient {
    @Override
    public String getUsers() {
        return "getUsers fallback";
    }
}
