package com.mypyme.mypyme.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Department {

    private String id;

    private String name;

    private String description;

    private String location;

    private String phoneNumber;

    private List<Employee> employees;
}
