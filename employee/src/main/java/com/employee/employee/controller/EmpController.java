package com.employee.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
