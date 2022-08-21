package fr.orsys.ms.avisbackend.dao;


import fr.orsys.ms.avisbackend.business.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
