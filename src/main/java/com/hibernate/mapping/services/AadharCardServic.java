package com.hibernate.mapping.services;

import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.AadharCard;

public interface AadharCardServic {
	
	public AadharCard getAadharById(int aadharCardId);

}
