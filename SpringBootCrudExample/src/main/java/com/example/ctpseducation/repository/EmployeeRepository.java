package com.example.ctpseducation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ctpseducation.entity.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
