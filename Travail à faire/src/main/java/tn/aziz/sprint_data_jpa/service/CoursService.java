package tn.aziz.sprint_data_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.aziz.sprint_data_jpa.entity.Cours;
import tn.aziz.sprint_data_jpa.repository.CoursRepository;

import java.util.List;

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
