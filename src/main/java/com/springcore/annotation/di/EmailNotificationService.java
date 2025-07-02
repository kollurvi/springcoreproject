package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        log.info("Sending Email Notification to {}: {}", recipient, message);
    }
}
