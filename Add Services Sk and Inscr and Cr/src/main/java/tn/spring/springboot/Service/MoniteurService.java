package tn.spring.springboot.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Cours;
import tn.spring.springboot.Entity.Moniteur;
import tn.spring.springboot.Repository.CoursRepository;
import tn.spring.springboot.Repository.MoniteurRepository;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class MoniteurService implements  IMoniteurService{

    @Autowired
    private MoniteurRepository moniteurRepository;
    @Autowired
    private CoursRepository coursRepository;

    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addOrUpdateMoniteur(Moniteur m) {
        return moniteurRepository.save(m);
    }

    @Override
    public void removeMoniteur(Long moniteurId) {
        moniteurRepository.deleteById(moniteurId);
    }

    @Override
    public Moniteur retrieveMoniteur(Long moniteurId) {
        return moniteurRepository.findById(moniteurId).orElse(null);
    }

    @Override
    public Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours cours = coursRepository.findById(numCourse)
                .orElseThrow(() -> new NoSuchElementException("Cours not found"));
        moniteur.getCours().add(cours);
        return moniteurRepository.save(moniteur);
    }
    @Transactional
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours course = coursRepository.findById(numCourse).orElse(null);
        if (course != null) {
            moniteur.getCours().add(course);
            moniteur = moniteurRepository.save(moniteur);
        }
        return moniteur;
    }

}
