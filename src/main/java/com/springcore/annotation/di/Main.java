package com.springcore.annotation.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.di");
        Driver driver = context.getBean("driver", Driver.class);
        driver.drive();
    }
}
