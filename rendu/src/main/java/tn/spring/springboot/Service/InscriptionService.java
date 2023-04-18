package tn.spring.springboot.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Abonnement;
import tn.spring.springboot.Entity.Cours;
import tn.spring.springboot.Entity.Inscription;
import tn.spring.springboot.Entity.Skieur;
import tn.spring.springboot.Repository.CoursRepository;
import tn.spring.springboot.Repository.InscriptionRepository;
import tn.spring.springboot.Repository.SkieurRepository;

import java.util.*;

@Service
public class InscriptionService implements IInscriptionService{
    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Autowired
    private CoursRepository coursRepository;

    @Autowired
    private SkieurRepository skieurRepository;

    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return null;
    }


    @Override
    public void removeInscription(Inscription Inscription) {

    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return null;
    }

    @Override
    public Inscription assignInscriptionToCourse(Long numInscription, Long numCourse) {
        Inscription inscription = inscriptionRepository.findById(numInscription)
                .orElseThrow(() -> new NoSuchElementException("insc not found "));
        Cours cours = coursRepository.findById(numCourse)
                .orElseThrow(() -> new NoSuchElementException("cour not found "));

        inscription.setCours(cours);
        return inscriptionRepository.save(inscription);
    }

    @Override
    public Set<Skieur> getSubscriptionByType(Abonnement.TypeAbonnement type) {
        Set<Skieur> skieurs = new HashSet<>();
        List<Inscription> allInscriptions = inscriptionRepository.findAll();
        for (Inscription inscription : allInscriptions) {
            if (inscription.getSkieur().getAbonnement().getTypeAbonnement() == type) {
                skieurs.add(inscription.getSkieur());
            }
        }
        return skieurs;
    }

    @Override
    public List<Skieur> retrieveSkieursBySubscriptionType(Abonnement.TypeAbonnement typeAbonnement) {
        List<Skieur> skieurs = new ArrayList<>();
        List<Inscription> allInscriptions = inscriptionRepository.findAll();
        for (Inscription inscription : allInscriptions) {
            if (inscription.getSkieur().getAbonnement().getTypeAbonnement() == typeAbonnement) {
                skieurs.add(inscription.getSkieur());
            }
        }
        return skieurs;
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(Date startDate, Date endDate) {
        List<Skieur> skieurs = skieurRepository.findAll();
        List<Abonnement> abonnements = new ArrayList<>();

        for (Skieur skieur : skieurs) {
            List<Abonnement> skieurAbonnements = skieur.getAllAbonnements();
            for (Abonnement abonnement : skieurAbonnements) {
                Date abonnementStartDate = abonnement.getDateDebut();
                Date abonnementEndDate = abonnement.getDateFin();
                if ((abonnementStartDate.equals(startDate) || abonnementStartDate.after(startDate))
                        && (abonnementEndDate.equals(endDate) || abonnementEndDate.before(endDate))) {
                    abonnements.add(abonnement);
                }
            }
        }
        return abonnements;
    }


    @Override
    public Inscription addOrUpdateInscription(Inscription inscription, Long numSkieur, Long numCours) {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElseThrow(() -> new NoSuchElementException("Skieur not found"));
        Cours cours = coursRepository.findById(numCours)
                .orElseThrow(() -> new NoSuchElementException("Cours not found"));

        inscription.setSkieur(skieur);
        inscription.setCours(cours);

        return inscriptionRepository.save(inscription);
    }





}
