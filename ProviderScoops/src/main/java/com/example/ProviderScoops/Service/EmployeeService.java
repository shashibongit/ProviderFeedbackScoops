package com.example.ProviderScoops.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProviderScoops.Entity.Employee;
import com.example.ProviderScoops.Repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	

	public void saveorUpdate(Employee employee) {
		
		repo.save(employee);
		
	}



	public Iterable<Employee> listAll() {
		
		return this.repo.findAll();
		
		
	}






	public void deleteEmployee(String _id) {
		repo.deleteById(_id);
	}

	
}
