package com.example.ctpseducation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ctpseducation.entity.Employee;
import com.example.ctpseducation.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/fetch/all")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/fetch/{id}")
	public Employee getEmployeeById(@PathVariable("id") String id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void deleteEmployee(@PathVariable("id") String id) {
		 employeeService.deleteEmployee(id);
	}

}
