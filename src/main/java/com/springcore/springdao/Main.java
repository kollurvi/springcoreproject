package com.springcore.springdao;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.springdao");
        UserDAO userDAO = context.getBean("userDAOImpl", UserDAO.class);

        User user = new User(1, "john_doe", "password123", "John Doe", "john@gmail.com");
        //int result = userDAO.insertUser(user);
        //log.info("User inserted successfully, rows affected: {}", result);

        List<User> users = userDAO.getAllUsers();
       // log.info("Users retrieved successfully, total users: {}", users.size());
        //users.forEach(user1 -> log.info(user1));

        User retrievedUser = userDAO.getUserById(6);
        log.info("User retrieved by ID: {}", retrievedUser);
    }
}
