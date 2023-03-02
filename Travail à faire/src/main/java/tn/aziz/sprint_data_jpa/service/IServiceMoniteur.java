package tn.aziz.sprint_data_jpa.service;

import tn.aziz.sprint_data_jpa.entity.Moniteur;

import java.util.List;

public interface IServiceMoniteur {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addOrUpdateMoniteur(Moniteur moniteur);
    void removeMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
}
