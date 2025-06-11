package com.springcore.annotation.postconstrcuctandpresdestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.postconstrcuctandpresdestroy");
        context.close();
    }
}
