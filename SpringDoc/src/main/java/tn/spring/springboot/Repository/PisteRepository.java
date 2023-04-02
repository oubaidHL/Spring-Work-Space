package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Piste;


@Repository
public interface PisteRepository extends JpaRepository<Piste, Long> {
    Piste findByNumPiste(Long numPiste);
}
