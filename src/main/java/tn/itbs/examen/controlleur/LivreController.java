package tn.itbs.examen.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.examen.model.Livre;
import tn.itbs.examen.services.LivreService;

@RestController
public class LivreController {

	@Autowired
	private LivreService livreService;
	
	@PostMapping
	public Livre ajouterLivre(@RequestBody Livre livre) {
		return livreService.ajouterLivre(livre);
	}
	
	@GetMapping
    public List<Livre> getTousLesLivres() {
        return livreService.getTousLesLivres();
    }
}
