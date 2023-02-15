package tn.spring.springboot.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    @Column
    private String nomM;
    @Column
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private Date    dateRecru;

}
