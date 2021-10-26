package com.hibernate.mapping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.mapping.entity.Department;
import com.hibernate.mapping.services.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired 
	private DepartmentService departmentService;
	
	@GetMapping("/getDepartment/{id}")
	public Department getDepartment(@PathVariable("id") int id) {
		return departmentService.getByDepartmentId(id);
		
	}
	

}
