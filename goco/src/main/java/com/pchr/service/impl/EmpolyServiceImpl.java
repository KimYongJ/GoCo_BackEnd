package com.pchr.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pchr.entity.Employee;
import com.pchr.repository.EmployeeRepository;
import com.pchr.service.EmployeeService;

@Service
public class EmpolyServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Optional<Employee> findByEmail(String email) {
		return employeeRepository.findByEmail(email);
	}

	@Override
	public boolean existsByEmail(String email) {
		return employeeRepository.existsByEmail(email);
	}

}
