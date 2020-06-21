package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "garantie")
public class Garantie {

	@Id
	private Integer id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "montant")
	private Integer montant;
	@Column(name = "description")
	private String description ;
	
	public Garantie() {
		super();
	}
	public Garantie(Integer id, String nom, Integer montant, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.montant = montant;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(Integer montant) {
		this.montant = montant;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
