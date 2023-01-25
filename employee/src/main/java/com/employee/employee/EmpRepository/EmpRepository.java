package com.employee.employee.EmpRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.employee.model.Employee;

public interface EmpRepository extends MongoRepository<Employee, String>{

	//Employee save(Employee employee);

}
