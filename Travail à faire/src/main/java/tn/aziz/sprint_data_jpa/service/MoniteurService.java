package tn.aziz.sprint_data_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aziz.sprint_data_jpa.entity.Moniteur;
import tn.aziz.sprint_data_jpa.repository.MoniteurRepository;

import java.util.List;

@Service
public class MoniteurService implements IServiceMoniteur {

    @Autowired
    private MoniteurRepository moniteurRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addOrUpdateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void removeMoniteur(Moniteur moniteur) {
        moniteurRepository.delete(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
}