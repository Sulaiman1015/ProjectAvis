package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Avis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AvisDao extends JpaRepository<Avis, Long> {

    List<Avis> findAllByDate(LocalDate dateEnvoie);

    List<Avis> findAllByNote(Float note);
}
