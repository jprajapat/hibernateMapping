package com.hibernate.mapping.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.mapping.entity.AadharCard;

public interface AadharCardRepo extends JpaRepository<AadharCard, Integer> {
	public AadharCard findAadharCardById(int id);

}
