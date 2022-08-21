package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Plateforme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlateformeDao extends JpaRepository<Plateforme, Long> {

}
