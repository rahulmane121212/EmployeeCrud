package com.employee.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employee.EmpRepository.EmpRepository;
import com.employee.employee.exception.ResourceNotFoundException;
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

	@Override
	public Employee getEmpById(String empId) throws ResourceNotFoundException {
		Optional <Employee> empData = this.empRepository.findById(empId);
		
		if (empData.isPresent()) {
			return empData.get();
		}
		else {
			throw new ResourceNotFoundException("Record Not Found");
		}
		
	}

	@Override
	public Employee updateEmp(Employee employee) throws ResourceNotFoundException {
		Optional < Employee > empDetails = this.empRepository.findById(employee.getEmpId());
		
		if (empDetails.isPresent()) {
			Employee empUpdate = empDetails.get();
			empUpdate.setEmpId(employee.getEmpId());
			empUpdate.setEmpName(employee.getEmpName());
			empUpdate.setEmpSal(employee.getEmpSal());
			empUpdate.setEmpAddress(employee.getEmpAddress());
			empRepository.save(empUpdate);
			return empUpdate;
		}
		else {
			throw new ResourceNotFoundException("Record Not Found");
		}
		
	}
	
	

}
