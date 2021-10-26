package com.hibernate.mapping.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.Department;
import com.hibernate.mapping.repositories.DepartmentRepository;
import com.hibernate.mapping.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	

	@Override
	public Department saveDepartment() {
		return null;
	}

	@Override
	public Department getAllDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getByDepartmentId(int id) {
		// TODO Auto-generated method stub
		return departmentRepository.getById(id);
	}

}
