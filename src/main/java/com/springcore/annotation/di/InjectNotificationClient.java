package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;

@Component
@Log4j2
public class InjectNotificationClient {

    @Inject
    @Qualifier("emailNotificationService")
    private NotificationService notificationService;

    public void test(String message, String recipient) {
        log.info("Injected Client sending Notification to {}: {}", recipient, message);
        notificationService.sendNotification(message, recipient);
    }
}
