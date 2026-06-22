package com.employe.demo.controller;

import com.employe.demo.entity.Employee;
import com.employe.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @GetMapping("/")
    public String health() {
        return "UP";
    }
}
