package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;

@Log4j2
public class PropertyDataMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.springdao");

        log.info("Property data {} {} {}",
                context.getBean("propertyDataReader", PropertyDataReader.class).getIpAddress(),
                context.getBean("propertyDataReader", PropertyDataReader.class).getPortNumber(),
                context.getBean("propertyDataReader", PropertyDataReader.class).getConnType());
    }
}
