package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Editeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditeurDao extends JpaRepository<Editeur, Long> {

}
