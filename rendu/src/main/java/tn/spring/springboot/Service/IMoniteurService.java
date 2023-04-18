package tn.spring.springboot.Service;


import tn.spring.springboot.Entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addOrUpdateMoniteur(Moniteur moniteur);
    void removeMoniteur(Long moniteurId);
    Moniteur retrieveMoniteur(Long moniteurId);
    Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
