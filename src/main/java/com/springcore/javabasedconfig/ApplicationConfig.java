package com.springcore.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class ApplicationConfig {


    @Bean("date")
    public Date getDate(){
        return new Date();
    }
}

