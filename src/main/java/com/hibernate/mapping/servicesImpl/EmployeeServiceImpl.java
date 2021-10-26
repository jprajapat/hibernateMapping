package com.hibernate.mapping.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.mapping.entity.AadharCard;
import com.hibernate.mapping.entity.Employee;
import com.hibernate.mapping.repositories.DepartmentRepository;
import com.hibernate.mapping.repositories.EmployeeRepository;
import com.hibernate.mapping.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	@Override
	public Employee saveEmployee(Employee employee) {
		
		
		AadharCard aadharCard = new AadharCard();
		if (employee.getAadharCard() != null) {
			aadharCard.setAadharNumber(employee.getAadharCard().getAadharNumber());
			aadharCard.setEmployee(employee);
			employee.setAadharCard(aadharCard);
		}

		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getByEmployeeId(int emplolyeeId) {
		return employeeRepository.getById(emplolyeeId);
	}

}
