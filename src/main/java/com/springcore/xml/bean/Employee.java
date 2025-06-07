package com.springcore.xml.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
public class Employee {
    private int employeeId;
    private String employeeName;

    public void getEmployeeDetails() {
        log.info("Employee ID: {}, Employee Name: {}", employeeId, employeeName);
    }
}
