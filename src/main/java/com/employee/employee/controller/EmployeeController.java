package com.employee.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.entity.Employee;
import com.employee.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Employee getSingleEmployee(@PathVariable Integer id) {
		return employeeService.getSingleEmployee(id);
	}
	
	@PostMapping("/save")
	public String saveEmployee(@RequestBody Employee employee) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("Nitin Jogdand",23,7066596024l,14570,"USIT","Pune","INDIAN"));
		empList.add(new Employee("Vishal Mane",21,8475988666l,16560,"Hind","Pune","INDIAN"));
		
		for(Employee e: empList) {
			employeeService.saveEmployee(e);
		}
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
//		List<Employee> list = new ArrayList<>();
//		list.add(new Employee(1,"Nitin Jogdand",23,7066596024l,14570,"USIT","Pune","INDIAN"));
//		return list;
		return employeeService.getAllEmployee();
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return employeeService.deleteEmployee(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
}
