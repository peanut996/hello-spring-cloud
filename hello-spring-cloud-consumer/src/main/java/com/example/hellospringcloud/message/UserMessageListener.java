package com.example.hellospringcloud.message;

import com.example.hellospringcloud.message.channel.ConsumerChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@Slf4j
@EnableBinding(value = {ConsumerChannel.class})
public class UserMessageListener {

    @StreamListener(ConsumerChannel.INPUT)
    public void onUserMessage(UserMessage userMessage){
        log.info("已接受消息: " + userMessage.toString());
    }

}
