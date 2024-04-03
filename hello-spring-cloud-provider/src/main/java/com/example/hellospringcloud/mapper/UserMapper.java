package com.example.hellospringcloud.mapper;


import com.example.hellospringcloud.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> list();
}
