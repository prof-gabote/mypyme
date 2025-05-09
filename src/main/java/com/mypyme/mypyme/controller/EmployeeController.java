package com.mypyme.mypyme.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypyme.mypyme.dto.EmployeeDTO;
import com.mypyme.mypyme.model.Employee;
import com.mypyme.mypyme.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    Logger logger = org.slf4j.LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/status")
    public String getStatus() {
        return "Employee API is running! 🙌";
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById (@PathVariable Long id) {

        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            logger.error("Employee with ID {} not found", id);
            return null;
        }

        logger.info("Employee with ID {} found", id);

        EmployeeDTO employeeDTO = employeeService.convertToDTO(employee);

        logger.info("Employee: {}", employeeDTO);
        return employeeDTO;
    }

    @GetMapping()
    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        if (employees.isEmpty()) {
            logger.error("No employees found");
            return null;
        }

        logger.info("Found {} employees", employees.size());

        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeDTO employeeDTO = employeeService.convertToDTO(employee);
            employeeDTOs.add(employeeDTO);
        }

        logger.info("Employees: {}", employeeDTOs);
        return employeeDTOs;
    }

    @GetMapping("/department/{id}")
    public List<EmployeeDTO> getEmployeesByDepartmentId(@PathVariable String id) {
        List<Employee> employees = employeeService.getEmployeesByDepartmentId(id);
        if (employees.isEmpty()) {
            logger.error("No employees found for department ID {}", id);
            return null;
        }

        logger.info("Found {} employees for department ID {}", employees.size(), id);

        List<EmployeeDTO> employeeDTOs = new ArrayList<>();

        for (Employee employee : employees) {
            EmployeeDTO employeeDTO = employeeService.convertToDTO(employee);
            employeeDTOs.add(employeeDTO);
        }

        logger.info("Employees: {}", employeeDTOs);
        return employeeDTOs;
    }

    @PostMapping()
    public EmployeeDTO createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.saveEmployee(employee);
        if (savedEmployee == null) {
            logger.error("Failed to save employee");
            return null;
        }

        logger.info("Employee saved: {}", savedEmployee);

        EmployeeDTO employeeDTO = employeeService.convertToDTO(savedEmployee);
        logger.info("Employee DTO: {}", employeeDTO);
        return employeeDTO;
    }
    
    
}
