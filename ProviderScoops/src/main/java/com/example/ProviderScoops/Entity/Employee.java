package com.example.ProviderScoops.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {


	@Id
	private String _id;
	private String username;
	
	private String password;
	
	
	
	
	public Employee(String username, String password,String id) {
		super();
		this.username = username;
		this.password = password;
		this._id = id;
	}
	
	
public Employee() {
		
		// TODO Auto-generated constructor stub
	}


	
	public String getId() {
		return _id;
	}


	public void setId(String id) {
		this._id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", id=" + _id + "]";
	}
	
	
}
