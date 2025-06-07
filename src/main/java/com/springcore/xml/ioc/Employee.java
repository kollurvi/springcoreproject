package com.springcore.xml.ioc;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class Employee {
    private int employeeId;
    private String employeeName;

    public void getEmployeeDetails() {
        log.info("Employee ID: " + employeeId);
        log.info("Employee Name: " + employeeName);
    }
}
