package tn.aziz.sprint_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.aziz.sprint_data_jpa.entity.Skieur;

@Repository
public interface SkieurRepository extends JpaRepository<Skieur, Long> {
}
