package com.springcore.springdao.controller;

import com.springcore.springdao.entity.Employee;
import com.springcore.springdao.service.EmployeeService;
import com.springcore.springdao.service.EmployeeServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


@Component
@Log4j2
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    public void updateEmployee() {
        Employee employee = new Employee();
        employee.setName("Vidyasagar");
        employee.setEmail("myemail@gmail.com");
        employee.setSalary(10000l);// Logic to update employee details

        employeeService.saveEmployee(employee);
    }

    public void getEmployees() {
        // Logic to get all employees
        List<Employee> all = employeeService.getAllEmployees();

        for (Employee e : all) {
            log.info("Employee Details: ID={}, Name={}, Email={}, Salary={}",
                    e.getId(), e.getName(), e.getEmail(), e.getSalary());
        }
    }

    public boolean existsByName(String name) {
        return employeeService.existsByName(name);
    }

    public Employee getEmployeeByName(String name) {
        return employeeService.findByName(name).orElse(null);
    }
}
