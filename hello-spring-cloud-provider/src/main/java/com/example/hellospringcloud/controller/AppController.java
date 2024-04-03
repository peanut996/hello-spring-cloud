package com.example.hellospringcloud.controller;

import com.example.hellospringcloud.annotation.MeasureExecutionTime;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AppController {

    private final DiscoveryClient discoveryClient;

    private final EurekaClient eurekaClient;

    @GetMapping("/apps")
    @MeasureExecutionTime
    Applications list() {
        return eurekaClient.getApplications();
    }
}
