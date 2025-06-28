package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext("com.springcore.annotation.bean");

        Student student = appContext.getBean("student", Student.class);
        student.setStudentId(12345);
        student.setStudentName("Sagar");

        student.getStudentDetails();
    }
}
