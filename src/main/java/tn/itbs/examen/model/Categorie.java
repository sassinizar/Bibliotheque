package tn.itbs.examen.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_categorie;
	@Column(nullable = false)
	String nomCategorie;
	String Description;
	
	@ManyToMany(mappedBy = "categories")  
	List<Livre> Livres = new ArrayList<Livre>();
	
	public Long getId() {
		return id_categorie;
	}
	public void setId(Long id) {
		this.id_categorie = id;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
