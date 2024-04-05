package com.example.hellospringcloud.controller;

import com.example.hellospringcloud.annotation.MeasureExecutionTime;
import com.example.hellospringcloud.model.User;
import com.example.hellospringcloud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping(value="/message", method = RequestMethod.POST)
    @MeasureExecutionTime
    public String produce() {
        userService.publish();
        return "ok";
    }
}
