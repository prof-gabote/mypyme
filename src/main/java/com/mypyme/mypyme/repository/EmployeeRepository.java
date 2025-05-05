package com.mypyme.mypyme.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mypyme.mypyme.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findBySalaryGreaterThan(int salary);

    List<Employee> findByDepartmentId(String departmentId);

    List<Employee> findByJobTitle(String jobTitle);

    List<Employee> findByBirthDateAfter(Date date);

    List<Employee> findBySalaryBetween(int min, int max);

    List<Employee> findByFirstNameStartingWith(String prefix);

    List<Employee> findByFirstNameContaining(String keyword);

    List<Employee> findByProjectsId(Long projectId);

    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> findHighEarnersOrderBySalaryDesc();

    @Query("SELECT e FROM Employee e WHERE SIZE(e.projects) > 2")
    List<Employee> findEmployeesWithMoreThanTwoProjects();

    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE %:name% OR e.lastName LIKE %:name%")
    List<Employee> searchByFirstNameOrLastName(String name);

}
