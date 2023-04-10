package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Cours;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long> {
}
