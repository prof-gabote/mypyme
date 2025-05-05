package com.mypyme.mypyme.dto;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private String gender;
    private int salary;
    private String jobTitle;
    private String departmentId; // Solo el ID del departmento
    private String payrollAccountBankName; //Nombre de la cuenta
    private String payrollAccountNumber; //Número de la cuenta
    private List<String> projectNames; // Lista de IDs de proyectos
}
