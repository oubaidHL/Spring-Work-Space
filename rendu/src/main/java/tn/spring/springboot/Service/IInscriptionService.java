package tn.spring.springboot.Service;


import tn.spring.springboot.Entity.Abonnement;
import tn.spring.springboot.Entity.Inscription;
import tn.spring.springboot.Entity.Skieur;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    void removeInscription(Inscription Inscription);
    Inscription retrieveInscription(Long numInscription);
    Inscription assignInscriptionToCourse(Long numInscription, Long numCourse);

    Set<Skieur> getSubscriptionByType(Abonnement.TypeAbonnement type);

    List<Skieur> retrieveSkieursBySubscriptionType(Abonnement.TypeAbonnement typeAbonnement);

    List<Abonnement> retrieveSubscriptionsByDates(Date startDate, Date endDate);


    Inscription addOrUpdateInscription(Inscription inscription, Long numSkieur, Long numCours);
}
