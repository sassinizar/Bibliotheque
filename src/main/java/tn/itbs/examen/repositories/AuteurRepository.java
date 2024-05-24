package tn.itbs.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.itbs.examen.model.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {

}
