package com.example.hellospringcloud.message.channel;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface ConsumerChannel {
    String INPUT = "custom";

    @Input(INPUT)
    SubscribableChannel receiver();
}
