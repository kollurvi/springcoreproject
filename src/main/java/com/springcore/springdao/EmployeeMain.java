package com.springcore.springdao;

import com.springcore.springdao.controller.EmployeeController;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Log4j2
@SpringBootApplication
@EnableJpaRepositories("com.springcore.springdao.repository")
@EntityScan("com.springcore.springdao.entity")
@ComponentScan("com.springcore.springdao")
public class EmployeeMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.springdao");

        context.getBean(EmployeeController.class).updateEmployee();
        context.getBean(EmployeeController.class).getEmployees();
        log.info("Name Exists: {}", context.getBean(EmployeeController.class).existsByName("Vidyasagar"));
        //context.getBean(EmployeeController.class).getEmployeeByName("Vidyasagar");
    }
}
