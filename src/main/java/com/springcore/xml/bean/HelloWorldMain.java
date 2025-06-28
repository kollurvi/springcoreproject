package com.springcore.xml.bean;

import lombok.extern.log4j.Log4j2;
import org.postgresql.translation.messages_bg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Log4j2
public class HelloWorldMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("HelloWorldBean.xml");

        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);
        log.info(helloWorld.getMessage());
        helloWorld.setMessage("New: Hello, World!");
        log.info(helloWorld.getMessage());
    }
}
