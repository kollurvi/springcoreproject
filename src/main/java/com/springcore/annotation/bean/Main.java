package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");

        Account account = context.getBean("account", Account.class);
        account.setAccountName("John Doe");
        account.setAccountNumber(123456789L);

        account.getAccountDetails();
    }
}
