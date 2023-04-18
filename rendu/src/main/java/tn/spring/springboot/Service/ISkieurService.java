package tn.spring.springboot.Service;


import tn.spring.springboot.Entity.Abonnement;
import tn.spring.springboot.Entity.Inscription;
import tn.spring.springboot.Entity.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addOrUpdateSkieur(Skieur skieur);
    void removeSkieur(Skieur skieur);
    Skieur retrieveSkieur(Long numSkieur);
    Skieur addSkieurWithAbonnement(Skieur skieur);
    void removeSkieurWithAbonnement(Skieur skieur);
    Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);


}



