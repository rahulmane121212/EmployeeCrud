package com.employee.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.exception.ResourceNotFoundException;
import com.employee.employee.model.Employee;
import com.employee.employee.service.EmpService;

@RestController
@RequestMapping("emp")

public class EmpController {

	@Autowired
	private EmpService empService;
	
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmp(@RequestBody Employee employee)
	{
		return ResponseEntity.ok().body(this.empService.addEmp(employee));
	}
	
	@GetMapping("/getAllEmp")
	public ResponseEntity< List < Employee >> getEmps(){
		return ResponseEntity.ok().body(empService.getEmps());
		
		}
	
	@GetMapping("/getEmpById/{empId}")
	public ResponseEntity < Employee > getEmpById(@PathVariable String empId) throws ResourceNotFoundException{
		return ResponseEntity.ok().body(empService.getEmpById(empId));
		
	}
	
	@PutMapping("/updateEmpById/{empId}")
	public ResponseEntity < Employee > updateEmp(@PathVariable String empId, @RequestBody Employee employee) throws ResourceNotFoundException {
		employee.setEmpId(empId);
		return ResponseEntity.ok().body(this.empService.updateEmp(employee));
		
	}
	
	
}
