package com.employee.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String employeeName;
	private Integer employeeAge;
	private Long employeeMobailNumber;
	private Integer employeeSalary;
	private String employeeCompany;
	private String employeeLivingCity;
	private String employeeNationality;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, Integer employeeAge, Long employeeMobailNumber, Integer employeeSalary,
			String employeeCompany, String employeeLivingCity, String employeeNationality) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeMobailNumber = employeeMobailNumber;
		this.employeeSalary = employeeSalary;
		this.employeeCompany = employeeCompany;
		this.employeeLivingCity = employeeLivingCity;
		this.employeeNationality = employeeNationality;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Long getEmployeeMobailNumber() {
		return employeeMobailNumber;
	}

	public void setEmployeeMobailNumber(Long employeeMobailNumber) {
		this.employeeMobailNumber = employeeMobailNumber;
	}

	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeCompany() {
		return employeeCompany;
	}

	public void setEmployeeCompany(String employeeCompany) {
		this.employeeCompany = employeeCompany;
	}

	public String getEmployeeLivingCity() {
		return employeeLivingCity;
	}

	public void setEmployeeLivingCity(String employeeLivingCity) {
		this.employeeLivingCity = employeeLivingCity;
	}

	public String getEmployeeNationality() {
		return employeeNationality;
	}

	public void setEmployeeNationality(String employeeNationality) {
		this.employeeNationality = employeeNationality;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", employeeMobailNumber=" + employeeMobailNumber + ", employeeSalary=" + employeeSalary
				+ ", employeeCompany=" + employeeCompany + ", employeeLivingCity=" + employeeLivingCity
				+ ", employeeNationality=" + employeeNationality + "]";
	}
	
	
}
