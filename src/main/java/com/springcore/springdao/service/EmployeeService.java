package com.springcore.springdao.service;

import com.springcore.springdao.repository.EmployeeRepository;
import com.springcore.springdao.entity.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    Optional<Employee> findByName(String name);
    boolean existsByName(String name);
}
