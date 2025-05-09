package com.mypyme.mypyme.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.mypyme.mypyme.model.Employee;

@Component
public class EmployeeToDTOConverter implements Converter<Employee, EmployeeDTO> {

    @Override
    public EmployeeDTO convert(Employee employee) {
        if (employee == null) {
            return null;
        }

        return EmployeeDTO.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .email(employee.getEmail())
                .jobTitle(employee.getJobTitle())
                .departmentName(employee.getDepartment().getName())
                .build();
    }

}
