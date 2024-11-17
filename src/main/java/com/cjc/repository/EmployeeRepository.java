package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
