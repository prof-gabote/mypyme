package com.mypyme.mypyme.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.mypyme.mypyme.model.Employee;
import com.mypyme.mypyme.model.Project;

@Component
public class EmployeeToEmployeeDTOConverter implements Converter<Employee, EmployeeDTO>{

    @Override
    @Nullable
    public EmployeeDTO convert(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setEmail(employee.getEmail());
        dto.setBirthDate(employee.getBirthDate());
        dto.setGender(employee.getGender());
        dto.setSalary(employee.getSalary());
        dto.setJobTitle(employee.getJobTitle());
        dto.setDepartmentId(employee.getDepartment() != null ? employee.getDepartment().getId() : null);
        dto.setPayrollAccountBankName(employee.getPayrollAccount() != null ? employee.getPayrollAccount().getBankName() : null);
        dto.setPayrollAccountNumber(employee.getPayrollAccount() != null ? employee.getPayrollAccount().getAccountNumber() : null);
        
        // Proyectos
        if (employee.getProjects() != null) {
            List<String> projectNames = new ArrayList<>();
            for (Project project : employee.getProjects()) {
                projectNames.add(project.getName());
            }
            dto.setProjectNames(projectNames);
        } else {
            dto.setProjectNames(null);
        }
        return dto;
    }

}
