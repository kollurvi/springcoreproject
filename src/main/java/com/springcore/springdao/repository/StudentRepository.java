package com.springcore.springdao.repository;

import com.springcore.springdao.entity.Student;
import com.springcore.springdao.exceptions.StudentHandlerExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    /*public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/

    public int saveStudent(Student student) {
        try {
            String sql = "INSERT INTO student (name, age, email) VALUES (?, ?, ?)";
            return jdbcTemplate.update(sql, student.getName(), student.getAge(),
                    student.getEmail());
        } catch (Exception e) {
            throw new StudentHandlerExceptions.DatabaseOperationException("Failed to save student", e);
        }
    }

    public int updateStudent(Student student) {
        try {
        String sql = "UPDATE student SET name = ?, age = ?, email = ? WHERE id = ?";
        return jdbcTemplate.update(sql, student.getName(), student.getAge(),
                student.getEmail(), student.getId());
        } catch (Exception e) {
            throw new StudentHandlerExceptions.DatabaseOperationException("Failed to update student", e);
        }
    }

    public int deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    public List<Student> findAllStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new StudentMapper());
    }
}
