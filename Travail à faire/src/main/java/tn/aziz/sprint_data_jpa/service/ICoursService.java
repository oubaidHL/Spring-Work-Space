package tn.aziz.sprint_data_jpa.service;

import tn.aziz.sprint_data_jpa.entity.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addOrUpdateCours(Cours cours);
    void removeCours(Cours cours);
    Cours retrieveCours(Long numCours);
}
