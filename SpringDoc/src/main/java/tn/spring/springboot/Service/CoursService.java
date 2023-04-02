package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Cours;
import tn.spring.springboot.Repository.CoursRepository;

import java.util.*;

@Service
public class CoursService implements ICoursService {
    @Autowired
    private CoursRepository coursRepository;

    @Override
    public List<Cours> retrieveAllCourses() {
        return coursRepository.findAll();
    }

    @Override
    public Cours addOrUpdateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void removeCours(Cours cours) {
        coursRepository.delete(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }
}
