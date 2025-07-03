package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.scope");
        Customer customer1 = context.getBean("customer", Customer.class);
        log.info(customer1.hashCode());

        Customer customer2 = context.getBean("customer", Customer.class);
        log.info(customer2.hashCode());
    }
}
