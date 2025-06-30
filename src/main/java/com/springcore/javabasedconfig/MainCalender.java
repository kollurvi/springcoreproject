package com.springcore.javabasedconfig;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;

import java.util.Calendar;
@Log4j2
public class MainCalender {
    public static void main(String[] args) {
        ApplicationContext context = new org.springframework.context.annotation.AnnotationConfigApplicationContext("com.springcore.javabasedconfig");

        Calendar cal = context.getBean("calender", Calendar.class);

        log.info("Current Date and Time: " + cal.getTime());
    }
}