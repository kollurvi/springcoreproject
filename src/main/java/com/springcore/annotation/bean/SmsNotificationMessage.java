package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SmsNotificationMessage implements NotificationMessage  {
    private String message;

    public void sendMessage(String message) {
        this.message = message;
        log.info("Sending Sms Notification: {}", message);
    }
}
