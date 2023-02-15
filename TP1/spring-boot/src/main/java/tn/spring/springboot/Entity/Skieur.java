package tn.spring.springboot.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkieur;

    @Column(nullable = false)
    private String nomS;

    @Column(nullable = false)
    private String prenomS;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Column
    private String ville;

}
