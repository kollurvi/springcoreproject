package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class EmailNotificationMessage implements NotificationMessage  {
    private String message;

    public void sendMessage(String message) {
        this.message = message;
        log.info("Sending Email Notification: {}", message);
    }
}
