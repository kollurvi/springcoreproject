package com.springcore.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2

@Component
public class Student {
    private long studentId;
    private String studentName;

    public void getStudentDetails()
    {
        log.info("Student ID: {}, Student Name: {}", studentId, studentName);
    }

}