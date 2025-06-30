package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Log4j2
@Component
//@Primary
public class SmsNotificationMessage implements NotificationMessage  {
    private String message;

    public void sendMessage(String message) {
        this.message = message;
        log.info("Sending Sms Notification: {}", message);
    }
}
