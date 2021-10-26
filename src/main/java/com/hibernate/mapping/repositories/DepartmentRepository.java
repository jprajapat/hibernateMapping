package com.hibernate.mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.mapping.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
