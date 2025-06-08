package com.springcore.xml.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("setterbean.xml");
        Account account = context.getBean("account", Account.class);
        account.getAccountDetails();
    }
}
