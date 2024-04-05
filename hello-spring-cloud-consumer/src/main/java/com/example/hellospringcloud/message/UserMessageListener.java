package com.example.hellospringcloud.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@Slf4j
public class UserMessageListener {

    @StreamListener(Sink.INPUT)
    public void onUserMessage(UserMessage userMessage){
        log.info("已接受消息: " + userMessage.toString());
    }

}
