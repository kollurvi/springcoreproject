package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.springdao");
        UserDAO userDAO = context.getBean("userDAO", UserDAO.class);

        User user = new User();
        user.setUsername("Amit");
        user.setPassword("amit");
        user.setFullname("Amit Vishwa");
        user.setEmail("amit@gmail.com");
        userDAO.save(user);
    }
}
