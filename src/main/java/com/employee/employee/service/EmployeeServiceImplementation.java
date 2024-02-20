package com.employee.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.entity.Employee;
import com.employee.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee getSingleEmployee(Integer id) {
		System.out.println("Commint Git");
		System.out.println("dyeiruyerituyert");
		System.out.println("Nitin Jogdand");
		return employeeRepository.findById(id).get();
	}
	
	public String saveEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		return "Employee Save Sucessfully.";
	}
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public String deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		return "Employee Deleted Sucessfully.";
	}
}
