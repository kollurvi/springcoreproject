package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.springdao");
        UserDAO userDAOImpl = context.getBean("userDAOImpl", UserDAO.class);

        User user = new User();
        user.setUsername("Amit1");
        user.setPassword("amit1");
        user.setFullname("Amit Vishwa");
        user.setEmail("amit@gmail.com");
        userDAOImpl.save(user);

        User user1 = userDAOImpl.findById(2);
        log.info(user1);
    }
}
