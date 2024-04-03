package com.example.hellospringcloud.controller;

import com.example.hellospringcloud.annotation.MeasureExecutionTime;
import com.example.hellospringcloud.model.User;
import com.example.hellospringcloud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    public final ApplicationContext applicationContext;
    public final UserService userService;

    @GetMapping("/users")
    @MeasureExecutionTime
    List<User> list() {
        return userService.list();
    }
}
