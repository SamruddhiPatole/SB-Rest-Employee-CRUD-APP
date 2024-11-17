package com.cjc.service;

import java.util.List;

import com.cjc.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployee(int id);

	List<Employee> deleteEmployee(int id);

}
