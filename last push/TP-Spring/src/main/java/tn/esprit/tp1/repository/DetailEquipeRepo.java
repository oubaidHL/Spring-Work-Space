package tn.esprit.tp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp1.entity.DetailEquipe;

@Repository
public interface DetailEquipeRepo extends JpaRepository<DetailEquipe, Integer> {
}
