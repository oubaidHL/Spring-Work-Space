package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Cours;

import java.util.List;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
    @Query("SELECT DISTINCT WEEK(c.dateDebut) FROM Cours c JOIN c.inscriptions i WHERE i.instructeur.numInstructeur = :numInstructor AND c.support = :support")
    List<Integer> findWeeksByInstructorAndSupport(@Param("numInstructor") Long numInstructor, @Param("support") Cours.Support support);

}
