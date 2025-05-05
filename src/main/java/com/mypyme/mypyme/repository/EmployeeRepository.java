package com.mypyme.mypyme.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mypyme.mypyme.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //¿Cómo podemos construir consultas personalizadas?

}
