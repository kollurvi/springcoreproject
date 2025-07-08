package com.jdbc.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;

@Log4j2
@Controller
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void performStudentOperations() {
        Student student = new Student();
        student.setId(10);
        student.setName("John");
        student.setAge(20);
        student.setEmail("John@gmail.com");
        studentService.saveStudent(student);

        student.setId(11);
        student.setName("Suneel");
        student.setAge(21);
        student.setEmail("Suneel@gmail.com");
        studentService.saveStudent(student);

        studentService.findAllStudents();

        log.info("Student details: {}", studentService.findStudentById(35));

        //studentService.deleteStudentById(10);
        //studentService.deleteStudentById(20);
    }
}
