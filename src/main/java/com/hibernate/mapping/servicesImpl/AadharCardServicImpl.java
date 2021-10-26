package com.hibernate.mapping.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.AadharCard;
import com.hibernate.mapping.repositories.AadharCardRepo;
import com.hibernate.mapping.services.AadharCardServic;

@Service

public class AadharCardServicImpl implements AadharCardServic {
	
	@Autowired
	private AadharCardRepo aadharCardRepo;

	@Override
	public AadharCard getAadharById(int aadharCardId) {
		return aadharCardRepo.findAadharCardById(aadharCardId);
	}

}
