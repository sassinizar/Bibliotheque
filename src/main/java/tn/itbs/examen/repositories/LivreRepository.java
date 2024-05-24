package tn.itbs.examen.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.itbs.examen.model.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
	 List<Livre> findByTitreContainingIgnoreCase(String text);
}
