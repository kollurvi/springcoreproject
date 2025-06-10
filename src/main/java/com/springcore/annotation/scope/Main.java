package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.scope");

        Account account1 = context.getBean("account", Account.class);
        log.info("Account1:{}", account1.hashCode());

        Account account2 = context.getBean("account", Account.class);
        log.info("Account1:{}", account2.hashCode());
    }
}
