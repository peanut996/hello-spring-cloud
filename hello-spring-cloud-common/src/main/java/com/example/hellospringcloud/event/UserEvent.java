package com.example.hellospringcloud.event;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cloud.bus.event.Destination;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserEvent extends RemoteApplicationEvent {

    private String code;

    private String msg;

    public UserEvent(Object source, String originService, Destination destinationService, String code, String msg) {
        super(source, originService, destinationService);
        this.code = code;
        this.msg = msg;
    }

}
