package com.example.hellospringcloud.repository;

import com.example.hellospringcloud.model.User;

import java.util.List;

public interface UserRepository {
    List<User> list();
}
