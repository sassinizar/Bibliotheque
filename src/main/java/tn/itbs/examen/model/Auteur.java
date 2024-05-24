package tn.itbs.examen.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Auteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_auteur;
	@Column(nullable = false)
	String cin;
	@Column(nullable = false, unique = true)
	String nom;
	@Column(nullable = false)
	String prenom;
	@Column(nullable = false)
	String Nationalite;
	
	@OneToMany(mappedBy = "auteur")
	private List<Livre> Livres = new ArrayList<Livre>();
	
	public Long getId() {
		return id_auteur;
	}
	public void setId(Long id) {
		this.id_auteur = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNationalite() {
		return Nationalite;
	}
	public void setNationalite(String nationalite) {
		Nationalite = nationalite;
	}
	
	
}
