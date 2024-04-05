package com.example.hellospringcloud.message.publisher;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UserEventPublisher {

    private final ApplicationContext context;
    public void publishEvent(RemoteApplicationEvent event){
        if(null != context) {
            context.publishEvent(event);
            log.info("已发布事件:{}", event);
        }else{
            log.error("无法获取到当前Spring上下文信息，不能够发布事件");
        }
    }
}
