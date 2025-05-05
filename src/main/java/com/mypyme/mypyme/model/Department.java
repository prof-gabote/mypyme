package com.mypyme.mypyme.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Department {

    @Id
    private String id;

    private String name;

    private String description;

    private String location;

    private String phoneNumber;

    //¿Cómo hago una relación Uno es a Muchos?
    private List<Employee> employees;
}
