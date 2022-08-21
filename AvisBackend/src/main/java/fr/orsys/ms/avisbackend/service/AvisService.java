package fr.orsys.ms.avisbackend.service;

import fr.orsys.ms.avisbackend.business.Avis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AvisService {
    //add avis
    Avis ajourterAvis(Avis avis);

    //find all avis
    List<Avis> recupererListAvis();
    //find all with page
    Page<Avis> recupererListAvis(Pageable pageable);
    //find avis by save date
    List<Avis> recupererAvisByDate(LocalDate dateEnvoie);
    //find avis by note number
    List<Avis> recupererAvisByNote(Float note);

    //update avis
    Avis mettreAJourAvis(Avis avis);

    //delete avis
    String supprimerAvisById(Long id);
}
