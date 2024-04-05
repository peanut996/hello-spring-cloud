package com.example.hellospringcloud;

import com.example.hellospringcloud.message.channel.ProviderChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.hellospringcloud.*")
@SpringBootApplication
@EnableBinding({ProviderChannel.class})
public class HelloSpringCloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringCloudProviderApplication.class, args);
    }

}
