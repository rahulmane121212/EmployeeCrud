package com.employee.employee.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EmployeeCrud")

public class Employee {
	
	@Id
	private String empId;
	private String empName;
	private String empSal;
	private String empAddress;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empId, String empName, String empSal, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAddress = empAddress;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSal() {
		return empSal;
	}

	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	
	

}
