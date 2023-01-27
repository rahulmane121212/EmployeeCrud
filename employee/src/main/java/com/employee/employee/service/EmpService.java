package com.employee.employee.service;

import java.util.List;

import com.employee.employee.exception.ResourceNotFoundException;
import com.employee.employee.model.Employee;

public interface EmpService {

	Employee addEmp(Employee employee);

	List<Employee> getEmps();

	Employee getEmpById(String empId) throws ResourceNotFoundException;

	Employee updateEmp(Employee employee) throws ResourceNotFoundException;

	

}
