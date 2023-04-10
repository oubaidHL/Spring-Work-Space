package tn.spring.springboot.Service;

import tn.spring.springboot.Entity.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addOrUpdatePiste(Piste piste);
    void removePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
}
