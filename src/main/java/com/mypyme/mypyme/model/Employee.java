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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String firstName;

    @Column(nullable = false, length = 250)
    private String lastName;

    @Column(nullable = false, length = 250)
    private String email;

    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(nullable = true, length = 12)
    private String gender;

    @Column(nullable = false)
    private int salary;

    @Column(nullable = false, length = 250)
    private String jobTitle;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false) // Foreign key column
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payroll_account_id", nullable = false) // Foreign key column
    private PayrollAccount payrollAccount;

    @ManyToMany
    @JoinTable(
        name = "employee_projects",
        joinColumns = @JoinColumn(name = "employee_id"),
        inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects;
}
