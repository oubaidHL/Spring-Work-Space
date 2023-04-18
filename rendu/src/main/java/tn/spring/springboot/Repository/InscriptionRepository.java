package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Inscription;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
//    Cours findCourseByIdInscription(Long id);
//    List<Inscription> findByCoursId(Long coursId);
//    List<Object[]> findPistesBySkieurNomAndNumInscription(String nomSkieur, Long numInscription);
}