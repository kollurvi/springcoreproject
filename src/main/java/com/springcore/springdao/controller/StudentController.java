package com.springcore.springdao.controller;

import com.springcore.springdao.entity.Student;
import com.springcore.springdao.service.StudentService;
import org.springframework.stereotype.Controller;

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

        //studentService.deleteStudentById(10);
        //studentService.deleteStudentById(20);
    }
}
