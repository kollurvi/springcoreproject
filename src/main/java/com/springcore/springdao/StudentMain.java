package com.springcore.springdao;

import com.springcore.springdao.controller.StudentController;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2
public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.springdao");

        context.getBean(StudentController.class).performStudentOperations();
    }
}
