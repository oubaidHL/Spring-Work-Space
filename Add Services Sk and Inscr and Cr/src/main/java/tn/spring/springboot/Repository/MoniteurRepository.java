package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Moniteur;

@Repository
public interface MoniteurRepository extends JpaRepository<Moniteur, Long> {
    //void deleteById(Long moniteurId);


}
