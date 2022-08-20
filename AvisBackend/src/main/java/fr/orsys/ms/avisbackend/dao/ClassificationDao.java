package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationDao extends JpaRepository<Classification, Long> {

}
