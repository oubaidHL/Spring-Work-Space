package tn.aziz.sprint_data_jpa.service;

import tn.aziz.sprint_data_jpa.entity.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addOrUpdateSkieur(Skieur skieur);
    void removeSkieur(Skieur skieur);
    Skieur retrieveSkieur(Long numSkieur);
}



