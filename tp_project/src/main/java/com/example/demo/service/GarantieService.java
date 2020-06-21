package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Garantie;
import com.example.demo.repository.GarantieRepository;

@Service
public class GarantieService {
	
	@Autowired
	private GarantieRepository garantieRepository;
	
	public void save(Garantie garantie) {
		this.garantieRepository.save(garantie);
	}
	
	
	public ArrayList<Garantie> getAllGaranties() {
		return (ArrayList<Garantie>) garantieRepository.findAll();
	}
	
	public Garantie findGarantie(Integer id) {
		return  garantieRepository.findById(id).get();
	}
	
	public void deleteGarantie(Integer id) {
		garantieRepository.deleteById(id);
	}
}
