package fr.orsys.ms.avisbackend.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Joueur extends Utilisateur{
    private LocalDate dateDeNaissance;
    @OneToMany(mappedBy = "joueur")
    List<Avis> avis;
}
