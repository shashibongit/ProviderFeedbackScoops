package com.example.scoops.controller;

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

import com.example.scoops.entity.Scoop;
import com.example.scoops.service.ScoopService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("scoop")


public class ScoopController {
	

	@Autowired 
    private ScoopService scoopService;
	
	@PostMapping(value= "/save")
	public String saveScoop(@RequestBody Scoop scoop) {
		
		scoopService.saveorUpdate(scoop);
		return scoop.getId();
	}
	
	@GetMapping(value="/getAll")
	public Iterable<Scoop> getScoop() {
		
		
		return  scoopService.listAll();
	}
	
	@PutMapping(value="/edit/{id}")
	private Scoop update(@RequestBody Scoop scoop, @PathVariable(name="id")String _id) {
		
		scoop.setId(_id);
		scoopService.saveorUpdate(scoop);
		return scoop;
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteScoop(@PathVariable("id")String _id) {
		scoopService.deleteScoop(_id);
	}

	

}
