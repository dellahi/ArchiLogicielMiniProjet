package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Garantie;
import com.example.demo.service.GarantieService;

@RestController
@RequestMapping("/api")
public class GarantieController {
	
	@Autowired
	private GarantieService garantieService;

	@GetMapping("/add")
 	public String add() {
		garantieService.save(new Garantie(1, "Med", 1230, "description 1"));
		garantieService.save(new Garantie(2, "Medfff", 3230, "description 2"));
		garantieService.save(new Garantie(42, "Medooo", 4230, "description 3"));
		
		return "Objects added";
	}
	
	@GetMapping("/garantie")
	public ArrayList<Garantie> getAllGaranties(){
		ArrayList<Garantie> garanties = garantieService.getAllGaranties();
		return garanties;
	}
	
	@GetMapping("/garantie/{id}")
	public Garantie getGarantie(@PathVariable Integer id) {
		return garantieService.findGarantie(id);
	}
	
	@PutMapping("/garantie/{id}")
	public Garantie updateGarantie(@RequestBody Garantie garantie, @PathVariable Integer id) {
		Garantie garantie2 = garantieService.findGarantie(id);
		if(garantie2 != null) {
			garantie.setId(id);
			garantieService.save(garantie);
		}
		else return null;
		
		return garantie;
	}
	
	@RequestMapping(value="/garantie/{id}", method=RequestMethod.DELETE)
	public void deleteGarantie(@PathVariable("id") Integer id) {
		garantieService.deleteGarantie(id);
	}
}
