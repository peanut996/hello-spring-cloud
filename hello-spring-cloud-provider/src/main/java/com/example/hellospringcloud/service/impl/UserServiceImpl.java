package com.example.hellospringcloud.service.impl;

import com.example.hellospringcloud.message.UserMessage;
import com.example.hellospringcloud.message.channel.ProviderChannel;
import com.example.hellospringcloud.model.User;
import com.example.hellospringcloud.repository.UserRepository;
import com.example.hellospringcloud.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private MessageChannel output;

    @Autowired
    public UserServiceImpl(@Qualifier(ProviderChannel.OUTPUT) MessageChannel output, UserRepository userRepository) {
        this.userRepository = userRepository;
        this.output = output;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<User> list() {
        return userRepository.list();
    }

    @Override
    public void publish() {
        log.info("已发送消息");
        output.send(MessageBuilder.withPayload(UserMessage.builder()
                        .code("0")
                        .msg("update").build())
                .build());
    }
}
