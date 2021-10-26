package com.hibernate.mapping.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.mapping.entity.AadharCard;
import com.hibernate.mapping.services.AadharCardServic;

@RestController
public class AadharCardController {
	
	@Autowired 
	private AadharCardServic aadharCardServic;
	
	@GetMapping("/getAadharCard/{id}")
	public AadharCard getAadharCard(@PathVariable("id") int id) {
		return aadharCardServic.getAadharById(id);
		
	}

}
