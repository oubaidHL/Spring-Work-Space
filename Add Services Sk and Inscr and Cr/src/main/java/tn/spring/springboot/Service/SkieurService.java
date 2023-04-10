package tn.spring.springboot.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.*;
import tn.spring.springboot.Repository.*;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

@Service
public class SkieurService implements ISkieurService {

    @Autowired
    private SkieurRepository skieurRepository;

    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Autowired
    private PisteRepository pisteRepository;
    @Autowired
    private AbonnementRepo abonnementRepository;

    @Autowired
    private CoursRepository coursRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addOrUpdateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Skieur skieur) {
        if(skieurRepository.findById(skieur.getNumSkieur()).isPresent())
            skieurRepository.delete(skieur);

    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        Optional<Skieur> optionalSkieur = skieurRepository.findById(numSkieur);
        if (optionalSkieur.isPresent()) {
            return optionalSkieur.get();
        }
        return null;
    }

    @Override
    public Skieur addSkieurWithAbonnement(Skieur skieur) {
        Abonnement ab= abonnementRepository.save(skieur.getAbonnement());

        skieur.setAbonnement(ab);
        return skieurRepository.save(skieur);
    }



    @Override
    public void removeSkieurWithAbonnement(Skieur skieur) {
        skieur.setAbonnement(null);
        skieurRepository.delete(skieur);
    }


    @Override
    @Transactional
    public Inscription addInscriptionAndAssignToSkier(Inscription inscription, Long numSkieur) {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElseThrow(() -> new NoSuchElementException("Skieur not found with numSkieur " + numSkieur));
        inscription.setSkieur(skieur);
        skieur.getInscriptions().add(inscription);
        return inscriptionRepository.save(inscription);
    }

    @Override
    @Transactional
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur)
                .orElseThrow(() -> new NoSuchElementException("Skieur not found with numSkieur " + numSkieur));
        Piste piste = pisteRepository.findById(numPiste)
                .orElseThrow(() -> new NoSuchElementException("Skieur not found with numSkieur " + numSkieur));
        if (skieur != null && piste != null) {
            skieur.setPistes((Set<Piste>) piste);
            skieur = skieurRepository.save(skieur);
        }
        return skieur;

    }

    @Transactional
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCourse) {
        Cours course = coursRepository.findById(numCourse).orElse(null);
        if (course != null) {
            Inscription inscription = new Inscription();
            inscription.setSkieur(skieur);
            inscription.setCours(course);
            skieur.setInscriptions((List<Inscription>) inscription);
            skieur = skieurRepository.save(skieur);
        }
        return skieur;
    }



}
