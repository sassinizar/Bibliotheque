package tn.itbs.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import tn.itbs.examen.model.Livre;
import tn.itbs.examen.repositories.LivreRepository;

@Service
public class LivreService {

	@Autowired
	private LivreRepository livreRepository;
	
	
	public Livre ajouterLivre(Livre livre) {
        return livreRepository.save(livre);
    }
	
	public List<Livre> getTousLesLivres() {
        return livreRepository.findAll();
    }
	
	public List<Livre> getLivresParTitre(String text) {
        return livreRepository.findByTitreContainingIgnoreCase(text);
    }
}
