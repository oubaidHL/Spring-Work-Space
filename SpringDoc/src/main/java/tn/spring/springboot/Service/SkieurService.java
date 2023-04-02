package tn.spring.springboot.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Abonnement;
import tn.spring.springboot.Entity.Inscription;
import tn.spring.springboot.Entity.Piste;
import tn.spring.springboot.Entity.Skieur;
import tn.spring.springboot.Repository.AbonnementRepo;
import tn.spring.springboot.Repository.InscriptionRepository;
import tn.spring.springboot.Repository.PisteRepository;
import tn.spring.springboot.Repository.SkieurRepository;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

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
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur) .orElseThrow(() -> new NoSuchElementException("Skieur not found with numSkieur " + numSkieur));
        Piste piste = pisteRepository.findById(numPiste) .orElseThrow(() -> new NoSuchElementException("Skieur not found with numSkieur " + numSkieur));
            skieur.addPiste(piste);
            return skieurRepository.save(skieur);

    }
}
