package fr.orsys.ms.avisbackend.dao;

import fr.orsys.ms.avisbackend.business.Jeu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JeuDao extends JpaRepository<Jeu,Long> {
}
