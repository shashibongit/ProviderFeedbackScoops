package com.example.ProviderScoops.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProviderScoops.Entity.Employee;
import com.example.ProviderScoops.Service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("employee")


public class EmployeeController {
	

	@Autowired 
    private EmployeeService employeeService;	
	
	@PostMapping(value= "/save")
	public String saveEmployee(@RequestBody Employee employee) {
		
		employeeService.saveorUpdate(employee);
		return employee.getId(); 
	}
	
	@GetMapping(value="/getAll")
	public Iterable<Employee>getEmployee() {
		
		
		return  employeeService.listAll();
	}
	
	@PutMapping(value="/edit/{id}")
	private Employee update(@RequestBody Employee employee,@PathVariable(name="id")String _id) {
		
		employee.setId(_id);
		employeeService.saveorUpdate(employee);
		return employee; 
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteEmployee(@PathVariable("id")String _id) {
		employeeService.deleteEmployee(_id);
	}

	

}
