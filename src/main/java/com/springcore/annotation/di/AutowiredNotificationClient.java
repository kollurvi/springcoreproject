package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class AutowiredNotificationClient {

    @Autowired
    @Qualifier("smsNotificationService")
    private NotificationService notificationService;

    public void test(String message, String recipient) {
        log.info("Autowired Client sending Notification to {}: {}", recipient, message);

        notificationService.sendNotification(message, recipient);
    }
}
