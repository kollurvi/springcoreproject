package com.springcore.annotation.di;

import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;
import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.inject.Named;

@Component
@Log4j2
public class ResourceNotificationClient {

    @Resource(name="pushNotificationService")
    private NotificationService notificationService;

    public void test(String message, String recipient) {
        log.info("Resource Client sending Notification to {}: {}", recipient, message);
        notificationService.sendNotification(message, recipient);
    }
}
