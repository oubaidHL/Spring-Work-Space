package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring.springboot.Entity.Abonnement;
import tn.spring.springboot.Entity.Cours;

public interface AbonnementRepo extends JpaRepository<Abonnement, Long> {
}
