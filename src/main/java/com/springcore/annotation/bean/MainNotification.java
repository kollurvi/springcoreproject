package com.springcore.annotation.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ComponentScan(basePackages = "com.springcore.annotation.bean")
public class MainNotification {
    public static void main(String[] args) {
        // Create an application context
        ApplicationContext context = new AnnotationConfigApplicationContext(MainNotification.class);

        // Get the SmsNotificationMessage bean
        NotificationManager notificationManager = context.getBean(NotificationManager.class);

        // Send a message using the SmsNotificationMessage bean
        notificationManager.sendNotification("Hello, this is a test notification!");
    }
}
