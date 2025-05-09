package com.mypyme.mypyme.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mypyme.mypyme.dto.EmployeeDTO;
import com.mypyme.mypyme.dto.EmployeeToDTOConverter;
import com.mypyme.mypyme.model.Employee;
import com.mypyme.mypyme.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeToDTOConverter employeeToDTOConverter;

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeesByDepartmentId(String id) {
        return employeeRepository.findByDepartmentId(id);
    }

    public EmployeeDTO convertToDTO(Employee employee) {
        return employeeToDTOConverter.convert(employee);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
