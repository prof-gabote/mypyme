package com.mypyme.mypyme.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Employee {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    //¿Cómo manejamos un Date? Es diferente a un LocalDate
    private Date birthDate;

    private String gender;

    private int salary;

    private String jobTitle;

    //¿Cómo manejamos un Muchos es a Uno?
    private Department department;

    //¿Cómo manejamos un Uno es a Uno?
    private PayrollAccount payrollAccount;

    //¿Cómo manejamos el muchos es a muchos?
    private List<Project> projects;
}
