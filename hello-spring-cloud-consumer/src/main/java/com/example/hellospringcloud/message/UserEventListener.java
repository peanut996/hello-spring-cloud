package com.example.hellospringcloud.message;

import com.example.hellospringcloud.event.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserEventListener implements ApplicationListener<UserEvent> {
    @Override
    public void onApplicationEvent(UserEvent event) {
        log.info("已接受消息: " + event.toString());
    }
}
