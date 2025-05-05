package com.mypyme.mypyme.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mypyme.mypyme.model.Employee;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    //Traigamos el repository

    public Employee getEmployeeById(Long id) {
        return null;
    }

    public List<Employee> getAllEmployees() {
        return null;
    }

    // Métodos para búsquedas específicas

}
