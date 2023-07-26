 package com.example.ProviderScoops.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ProviderScoops.Entity.Employee;

@Repository

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
