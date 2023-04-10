package tn.spring.springboot.Service;



import tn.spring.springboot.Entity.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addOrUpdateCours(Cours cours);
    void removeCours(Cours cours);
    Cours retrieveCours(Long numCours);
}
