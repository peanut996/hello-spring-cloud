package com.example.hellospringcloud.repository.impl;

import com.example.hellospringcloud.mapper.UserMapper;
import com.example.hellospringcloud.model.User;
import com.example.hellospringcloud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
