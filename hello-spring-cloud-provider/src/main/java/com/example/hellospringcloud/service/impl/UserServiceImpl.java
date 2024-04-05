package com.example.hellospringcloud.service.impl;

import com.example.hellospringcloud.event.UserEvent;
import com.example.hellospringcloud.message.publisher.UserEventPublisher;
import com.example.hellospringcloud.model.User;
import com.example.hellospringcloud.repository.UserRepository;
import com.example.hellospringcloud.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.PathDestinationFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserEventPublisher userEventPublisher;

    private final PathDestinationFactory destinationFactory;

    private final BusProperties busProperties;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<User> list() {
        return userRepository.list();
    }

    @Override
    public void publish() {
        log.info("已发送消息");
        User user = userRepository.list().get(0);
        UserEvent event = new UserEvent(user, busProperties.getId(), destinationFactory.getDestination("**"),
                "0", "msg");
        userEventPublisher.publishEvent(event);
    }
}
