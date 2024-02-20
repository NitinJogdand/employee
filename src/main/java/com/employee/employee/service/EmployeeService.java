package com.employee.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.employee.entity.Employee;

@Service
public interface EmployeeService {
	public Employee getSingleEmployee(Integer id);

	public String saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee updateEmployee(Employee employee);
	
	public String deleteEmployee(Integer id);
}
