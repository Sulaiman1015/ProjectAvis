package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoueurDao extends JpaRepository<Joueur, Long> {

}
