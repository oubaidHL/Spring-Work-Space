package tn.spring.springboot.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Piste;
import tn.spring.springboot.Repository.PisteRepository;

import java.util.List;

@Service
@Transactional
public class PisteService implements IPisteService {
    @Autowired
    private PisteRepository pisteRepository;

    @Override
    public List<Piste> retrieveAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public Piste addOrUpdatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void removePiste(Piste piste) {
        pisteRepository.delete(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findByNumPiste(numPiste);
    }
}
