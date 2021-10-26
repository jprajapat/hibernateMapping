package com.hibernate.mapping.services;

import java.util.List;

import com.hibernate.mapping.entity.Employee;


public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getByEmployeeId(int emplolyeeId);

}
