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
import jakarta.persistence.ManyToOne;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_livre;
	@Column(nullable = false)
	String Titre;
	@Column(nullable = false)
	String Auteur;
	@Column(nullable = false)
	String ISBN;
	
	@ManyToOne
	@JoinColumn(name = "id_auteur")
	private Auteur auteur;
	
    @ManyToMany
    @JoinTable(
        name = "livre_categorie",
        joinColumns = @JoinColumn(name = "id_livre"),
        inverseJoinColumns = @JoinColumn(name = "id_categorie")
    )
	private List<Categorie> categories = new ArrayList<Categorie>();
	
	public Long getId() {
		return id_livre;
	}
	public void setId(Long id) {
		this.id_livre = id;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getAuteur() {
		return Auteur;
	}
	public void setAuteur(String auteur) {
		Auteur = auteur;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
}
