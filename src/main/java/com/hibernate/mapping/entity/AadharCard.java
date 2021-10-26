package com.hibernate.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AadharCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String aadharNumber;
	@JsonIgnore
	@OneToOne(mappedBy = "aadharCard", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Employee employee;
	

}
