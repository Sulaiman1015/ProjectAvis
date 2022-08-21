package fr.orsys.ms.avisbackend.service.impl;

import fr.orsys.ms.avisbackend.business.Avis;
import fr.orsys.ms.avisbackend.dao.AvisDao;
import fr.orsys.ms.avisbackend.service.AvisService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AvisServiceImpl implements AvisService {
    private AvisDao avisDao;

    @Override
    public Avis ajourterAvis(Avis avis) {
        return avisDao.save(avis);
    }

    @Override
    public List<Avis> recupererListAvis() {
        return avisDao.findAll();
    }


    @Override
    public Page<Avis> recupererListAvis(Pageable pageable) {
        return avisDao.findAll(pageable);
    }

    @Override
    public List<Avis> recupererAvisByDate(LocalDate dateEnvoie) {
        return avisDao.findAllByDate(dateEnvoie);
    }

    @Override
    public List<Avis> recupererAvisByNote(Float note) {
        return avisDao.findAllByNote(note);
    }

    @Override
    public Avis mettreAJourAvis(Avis avis) {
        avis.setDescription(avis.getDescription());
        avis.setDateEnvoie(avis.getDateEnvoie());
        avis.setNote(avis.getNote());
        return avisDao.save(avis);
    }

    @Override
    public String supprimerAvisById(Long id) {
        Optional<Avis> avis = avisDao.findById(id);
        if (avis == null) {
            return "avis non exist";
        }else {
            avisDao.deleteById(id);
            return "avis est supprimé";
        }
    }


}
