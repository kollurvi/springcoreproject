package com.springcore.xml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AccountMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml")) {
            Account account = context.getBean("account", Account.class);
            account.setAccountType("Savings");
            account.setAccountNumber(213123L);
            account.setCustomerName("John Doe");

            System.out.println("Account Number: " + account.getAccountNumber() + ", Account Type: " + account.getAccountType() + ", Customer Name: " + account.getCustomerName());
        }
    }
}
