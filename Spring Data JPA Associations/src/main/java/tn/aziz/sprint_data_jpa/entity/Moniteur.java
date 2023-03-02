package tn.aziz.sprint_data_jpa.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numMoniteur;
    private String nomM;
    private String prenomM;
    private Date dateRecru;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Cours> cours;


}
