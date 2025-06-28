package com.springcore.xml.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
public class Student {
    private long studentId;
    private String studentName;
    private String studentAddress;

    public Student() {
        log.info("######### Student Constructor Called #########");
    }

    public void getStudentDetails() {
        log.info("Student ID: {}, Student Name: {}, Student Address: {}", studentId, studentName, studentAddress);
    }
}
