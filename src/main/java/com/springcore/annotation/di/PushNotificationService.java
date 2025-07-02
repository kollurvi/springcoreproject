package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PushNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        log.info("Sending Push Notification to {}: {}", recipient, message);
    }
}
