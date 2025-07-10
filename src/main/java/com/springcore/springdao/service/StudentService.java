package com.springcore.springdao.service;

import com.springcore.springdao.entity.Student;
import com.springcore.springdao.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class StudentService {

    public StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public void upddateStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public void findAllStudents() {
        List<Student> students = studentRepository.findAllStudents();
        for (Student student : students) {
            log.info("Student ID: {} Name: {} Age: {} Email: {}",
                    student.getId(), student.getName(), student.getAge(), student.getEmail());
        }
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteStudent(id);
    }
}

