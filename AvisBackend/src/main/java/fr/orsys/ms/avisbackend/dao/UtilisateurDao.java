package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

}
