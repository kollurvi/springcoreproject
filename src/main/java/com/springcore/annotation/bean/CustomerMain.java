package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class CustomerMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");
        Customer customer = context.getBean("customer", Customer.class);
        customer.setCustomerId(1123l);
        customer.setCustomerName("John Doe");

        log.info("Customer ID: " + customer.getCustomerId());
        log.info("Customer Name: " + customer.getCustomerName());
    }
}
