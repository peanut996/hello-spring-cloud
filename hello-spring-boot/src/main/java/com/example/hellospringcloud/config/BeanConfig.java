package com.example.hellospringcloud.config;

import com.example.hellospringcloud.model.Problem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Problem problem() {
        return new Problem();
    }
}
