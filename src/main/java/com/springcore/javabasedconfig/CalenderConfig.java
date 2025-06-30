package com.springcore.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration("calConfig")
public class CalenderConfig {

    @Bean("calender")
    public Calendar getCalender()
    {
        return Calendar.getInstance();
    }
}
