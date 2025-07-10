package com.springcore.xml.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("paymentbean.xml");
        PaymentProcessor paymentProcessor = context.getBean("paymentProcessor", PaymentProcessor.class);
        paymentProcessor.processPayment(1000);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
