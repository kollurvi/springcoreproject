package com.springcore.annotation.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan (basePackages = "com.springcore.annotation.bean")
public class ConfigAddress {

}
