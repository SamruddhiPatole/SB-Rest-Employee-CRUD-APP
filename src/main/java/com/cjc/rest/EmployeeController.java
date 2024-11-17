package com.cjc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeService;

@RestController
public class EmployeeController {

	private EmployeeService service;

	@Autowired
	public void setService(EmployeeService service) {
		this.service = service;
	}

	@PostMapping(value = "/addEmployee")
	public Employee addData(@RequestBody Employee employee) {
		Employee emp = service.saveEmployee(employee);
		return emp;
	}
	
	@GetMapping(value = "/getEmployees")
	public List<Employee> getAllEmployees()
	{
		List<Employee> list=service.getAllEmployee();
		return list;
	}
	
	@GetMapping(value = "/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		Employee emp=service.getEmployee(id);
		return emp;
	}
	
	@DeleteMapping(value = "/deleteEmployee/{id}")
	public List<Employee> deleteEmployee(@PathVariable int id)
	{
		List<Employee> list=service.deleteEmployee(id);
		return list;
	}
	
	@PutMapping(value = "/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		Employee emp = service.saveEmployee(employee);
		return emp;
	}
}
