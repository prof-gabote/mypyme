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

    private final EmployeeRepository employeeRepository;
    private final EmployeeToEmployeeDTOConverter employeeToEmployeeDTOConverter;

    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            return employeeToEmployeeDTOConverter.convert(employee);
        }
        return null;
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeDTO dto = employeeToEmployeeDTOConverter.convert(employee);
            employeeDTOs.add(dto);
        }

        return employeeDTOs;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    // Métodos para búsquedas específicas

    public List<EmployeeDTO> findEmployeesBySalaryGreaterThan(int salary) {
        List<Employee> employees = employeeRepository.findBySalaryGreaterThan(salary);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findEmployeesByDepartmentId(String departmentId) {
        List<Employee> employees = employeeRepository.findByDepartmentId(departmentId);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findEmployeesByJobTitle(String jobTitle) {
        List<Employee> employees = employeeRepository.findByJobTitle(jobTitle);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findEmployeesByBirthDateAfter(Date date) {
        List<Employee> employees = employeeRepository.findByBirthDateAfter(date);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findBySalaryBetween(int min, int max) {
        List<Employee> employees = employeeRepository.findBySalaryBetween(min, max);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findByFirstNameStartingWith(String prefix) {
        List<Employee> employees = employeeRepository.findByFirstNameStartingWith(prefix);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findByFirstNameContaining(String keyword) {
        List<Employee> employees = employeeRepository.findByFirstNameContaining(keyword);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findByProjectsId(Long projectId) {
        List<Employee> employees = employeeRepository.findByProjectsId(projectId);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findHighEarnersOrderBySalaryDesc() {
        List<Employee> employees = employeeRepository.findHighEarnersOrderBySalaryDesc();
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> findEmployeesWithMoreThanTwoProjects() {
        List<Employee> employees = employeeRepository.findEmployeesWithMoreThanTwoProjects();
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }

    public List<EmployeeDTO> searchByFirstNameOrLastName(String name) {
        List<Employee> employees = employeeRepository.searchByFirstNameOrLastName(name);
        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            employeeDTOs.add(employeeToEmployeeDTOConverter.convert(employee));
        }

        return employeeDTOs;
    }
}
