package com.mypyme.mypyme.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

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

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
