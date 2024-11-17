package com.cjc.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repository.EmployeeRepository;
import com.cjc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository repository;

	@Autowired
	public void setRepository(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		repository.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = repository.findAll();
		return list;
	}
	@Override
	public Employee getEmployee(int id) {
		Optional<Employee> optional = repository.findById(id);
		if(optional.isPresent())
		{
		return optional.get();
	}
		return null;
	}
	@Override
	public List<Employee> deleteEmployee(int id) {
		repository.deleteById(id);
		return getAllEmployee();
	}
}
