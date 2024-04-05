package com.example.hellospringcloud.message.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProviderChannel {
    String OUTPUT = "custom";

    @Output(OUTPUT)
    MessageChannel sender();
}
