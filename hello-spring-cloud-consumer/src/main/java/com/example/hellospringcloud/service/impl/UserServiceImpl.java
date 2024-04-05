package com.example.hellospringcloud.service.impl;

import com.example.hellospringcloud.client.ProviderClient;
import com.example.hellospringcloud.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    /**
     * idea会提示more than one bean，但是实际上feign会自动管理
     */
    private final ProviderClient providerClient;


    @Override
    public String getUsers() {
        log.info("开始调用");
        return providerClient.getUsers();
    }


    public String getDefaultUsers() {
        log.info("服务降级");
        return "defaultUsers";
    }
}
