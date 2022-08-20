package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvisDao extends JpaRepository<Avis, Long> {

}
