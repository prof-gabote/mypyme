package com.mypyme.mypyme.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mypyme.mypyme.dto.EmployeeDTO;
import com.mypyme.mypyme.dto.EmployeeToEmployeeDTOConverter;
import com.mypyme.mypyme.model.Employee;
import com.mypyme.mypyme.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    //Traigamos el repository
    //Traigamos el convertidor

    public EmployeeDTO getEmployeeById(Long id) {
        return null;
    }

    public List<EmployeeDTO> getAllEmployees() {
        return null;
    }

    public Employee createEmployee(Employee employee) {
        return null;
    }

    public Employee updateEmployee(Long id, Employee employee) {
        return null;
    }

    public void deleteEmployee(Long id) {

    }

    // Métodos para búsquedas específicas

}
