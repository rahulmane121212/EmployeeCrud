package com.employee.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.EmpRepository.EmpRepository;
import com.employee.employee.model.Employee;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public Employee addEmp(Employee employee) {
		
		return empRepository.save(employee);
	}

	public List<Employee> getEmps() {
		
		return this.empRepository.findAll();
	}
	
	

}
