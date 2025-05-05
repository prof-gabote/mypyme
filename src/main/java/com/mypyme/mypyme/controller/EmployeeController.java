package com.mypyme.mypyme.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mypyme.mypyme.dto.EmployeeDTO;
import com.mypyme.mypyme.model.Employee;
import com.mypyme.mypyme.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/status")
    public String getStatus() {
        return "Employee API is running! 🙌";
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    // Nuevas rutas de búsqueda

    @GetMapping("/search/salary")
    public List<EmployeeDTO> findEmployeesBySalaryGreaterThan(@RequestParam int salary) {
        return employeeService.findEmployeesBySalaryGreaterThan(salary);
    }

    @GetMapping("/search/department")
    public List<EmployeeDTO> findEmployeesByDepartmentId(@RequestParam String departmentId) {
        return employeeService.findEmployeesByDepartmentId(departmentId);
    }

    @GetMapping("/search/job-title")
    public List<EmployeeDTO> findEmployeesByJobTitle(@RequestParam String jobTitle) {
        return employeeService.findEmployeesByJobTitle(jobTitle);
    }

    @GetMapping("/search/birthdate-after")
    public List<EmployeeDTO> findEmployeesByBirthDateAfter(@RequestParam @DateTimeFormat(pattern = "yyyy-mm-dd")Date date) {
        return employeeService.findEmployeesByBirthDateAfter(date);
    }

    @GetMapping("/search/salary-between")
    public List<EmployeeDTO> findBySalaryBetween(@RequestParam int min, @RequestParam int max) {
        return employeeService.findBySalaryBetween(min, max);
    }

    @GetMapping("/search/first-name-starts")
    public List<EmployeeDTO> findByFirstNameStartingWith(@RequestParam String prefix) {
        return employeeService.findByFirstNameStartingWith(prefix);
    }

    @GetMapping("/search/first-name-contains")
    public List<EmployeeDTO> findByFirstNameContaining(@RequestParam String keyword) {
        return employeeService.findByFirstNameContaining(keyword);
    }

    @GetMapping("/search/project")
    public List<EmployeeDTO> findByProjectsProjectId(@RequestParam Long projectId) {
        return employeeService.findByProjectsId(projectId);
    }

    @GetMapping("/search/high-earners")
    public List<EmployeeDTO> findHighEarnersOrderBySalaryDesc() {
        return employeeService.findHighEarnersOrderBySalaryDesc();
    }

    @GetMapping("/search/multiple-projects")
    public List<EmployeeDTO> findEmployeesWithMoreThanTwoProjects() {
        return employeeService.findEmployeesWithMoreThanTwoProjects();
    }

    @GetMapping("/search/name")
    public List<EmployeeDTO> searchByFirstNameOrLastName(@RequestParam String name) {
        return employeeService.searchByFirstNameOrLastName(name);
    }
}
