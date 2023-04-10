package tn.spring.springboot.Service;


import tn.spring.springboot.Entity.Abonnement;
import tn.spring.springboot.Entity.Inscription;
import tn.spring.springboot.Entity.Skieur;

import java.util.List;
import java.util.Set;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addOrUpdateInscription(Inscription Inscription);
    void removeInscription(Inscription Inscription);
    Inscription retrieveInscription(Long numInscription);
    Inscription assignInscriptionToCourse(Long numInscription, Long numCourse);

    Set<Skieur> getSubscriptionByType(Abonnement.TypeAbonnement type);

    List<Skieur> retrieveSkieursBySubscriptionType(Abonnement.TypeAbonnement typeAbonnement);
}
