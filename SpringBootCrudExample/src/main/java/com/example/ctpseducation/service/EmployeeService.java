package com.example.ctpseducation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ctpseducation.entity.Employee;
import com.example.ctpseducation.exception.EmployeeNotFoundException;
import com.example.ctpseducation.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id)
				.orElseThrow(()-> new EmployeeNotFoundException("Id not found"));
	}

	public void deleteEmployee(String id) {
		// TODO Auto-generated method stub
		 employeeRepository.deleteById(id);
	}

}
