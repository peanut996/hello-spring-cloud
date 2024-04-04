package com.example.hellospringcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

public interface UserService {

    String getUsers();

    String getDefaultUsers();
}
