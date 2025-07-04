package com.springcore.springdao.service;

import com.springcore.springdao.entity.Employee;
import com.springcore.springdao.repository.EmployeeRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        List<Employee> all = repository.findAll();
        return all;
    }

    public void saveEmployee(Employee employee) {
        repository.save(employee);

        log.info("Employee saved: {}", employee.toString());
    }

    public Optional<Employee> findByName(String name) {
        log.info("Finding employee by name: {}", name);
        return repository.findByName(name);
    }

    public boolean existsByName(String name) {
        log.info("Checking if employee exists by name: {}", name);
        return repository.existsByName(name);
    }
}
