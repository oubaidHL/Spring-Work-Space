package tn.aziz.sprint_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.aziz.sprint_data_jpa.entity.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
}
