package tn.aziz.sprint_data_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aziz.sprint_data_jpa.entity.Skieur;
import tn.aziz.sprint_data_jpa.repository.SkieurRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SkieurService implements ISkieurService {

    @Autowired
    private SkieurRepository skieurRepository;

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
}
