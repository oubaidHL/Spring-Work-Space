package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Skieur;


@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {

}
