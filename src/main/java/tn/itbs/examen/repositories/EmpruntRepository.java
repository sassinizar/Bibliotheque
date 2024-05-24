package tn.itbs.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.itbs.examen.model.Emprunteur;

public interface EmpruntRepository extends JpaRepository<Emprunteur, Long> {

}
