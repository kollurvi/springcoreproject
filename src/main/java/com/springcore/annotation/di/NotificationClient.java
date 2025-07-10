package com.springcore.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NotificationClient {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.springcore.annotation.di");

        context.getBean("autowiredNotificationClient", AutowiredNotificationClient.class).test("I am from AutoWired Client", "Vidya");
        context.getBean("injectNotificationClient", InjectNotificationClient.class).test("I am from Inject Client", "Sagar");
        context.getBean("resourceNotificationClient", ResourceNotificationClient.class).test("I am from Resource Client", "Kolluri");

        ((AnnotationConfigApplicationContext) context).close();
    }
}
    // Note: The above code assumes that the beans are defined in the same package or are scanned by the component scan.