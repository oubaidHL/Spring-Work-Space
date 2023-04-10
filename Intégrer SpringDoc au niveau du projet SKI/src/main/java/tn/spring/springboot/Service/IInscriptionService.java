package tn.spring.springboot.Service;


import tn.spring.springboot.Entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscriptions();
    Inscription addOrUpdateInscription(Inscription Inscription);
    void removeInscription(Inscription Inscription);
    Inscription retrieveInscription(Long numInscription);
    Inscription assignInscriptionToCourse(Long numInscription, Long numCourse);
}
