package fr.orsys.ms.avisbackend.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jeu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private LocalDate dateSortie;
    private String image;

    @OneToMany(mappedBy = "jeu")
    List<Avis> avis;

    @ManyToOne
    private Editeur editeur;
    @ManyToOne
    private Moderateur moderateur;
    @ManyToMany
    List<Plateforme> plateformes;
    @ManyToOne
    private Classification classification;
    @ManyToOne
    private Genre genre;
    @ManyToOne
    private ModeleEconomique modeleEconomique;

}
