package com.hibernate.mapping.services;

import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.Department;

@Service
public interface DepartmentService {
	
	Department saveDepartment();
	Department getAllDepartment();
	Department getByDepartmentId(int id);

}
