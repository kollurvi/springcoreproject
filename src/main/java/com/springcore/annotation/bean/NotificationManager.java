package com.springcore.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {
    @Autowired
    @Qualifier("emailNotificationMessage")
    //@Qualifier("smsNotificationMessage")
    private NotificationMessage notificationMessage;

    public void sendNotification(String message) {
        notificationMessage.sendMessage(message);
    }
}
