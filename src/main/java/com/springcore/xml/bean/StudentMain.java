package com.springcore.xml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Student student = applicationContext.getBean("student", Student.class);
        student.setStudentId(101);
        student.setStudentName("Alice");
        student.setStudentAddress("123 Main St");
        student.getStudentDetails();
    }
}
