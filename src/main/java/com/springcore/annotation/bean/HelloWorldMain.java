package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldMain {
    public static void main(String[] args) {
        // Create an application context using AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");

        // Retrieve the HelloWorld bean from the application context
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        // Set the message for the HelloWorld bean
        helloWorld.setMessage("Hello, Spring Framework with Annotations!");

        // Call the method to log the message
        helloWorld.getLogMessage();
    }

}
