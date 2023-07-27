package com.example.scoops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scoops.entity.Scoop;
import com.example.scoops.repo.ScoopRepo;

@Service
public class ScoopService {
	
	@Autowired
	private ScoopRepo repo;
	
	

	public void saveorUpdate(Scoop scoop) {
		
		repo.save(scoop);
		
	}



	public Iterable<Scoop> listAll() {
		
		return this.repo.findAll();
		
		
	}




	public void deleteScoop(String _id) {
		repo.deleteById(_id);
	}

	
}
