package com.springcore.annotation.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.componentscan");
        ApacReport apacReport = context.getBean("apacReport", ApacReport.class);
        apacReport.getReport();
    }
}
