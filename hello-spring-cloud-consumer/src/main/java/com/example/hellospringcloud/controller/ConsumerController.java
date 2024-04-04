package com.example.hellospringcloud.controller;


import com.example.hellospringcloud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConsumerController {

    private final UserService userService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public String getUsers() {
        return userService.getUsers();
    }
}