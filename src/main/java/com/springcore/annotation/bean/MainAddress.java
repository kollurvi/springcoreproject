package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAddress {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");

        Address address = context.getBean(Address.class);
        address.setAddress();
        address.getAddress();
    }
}
