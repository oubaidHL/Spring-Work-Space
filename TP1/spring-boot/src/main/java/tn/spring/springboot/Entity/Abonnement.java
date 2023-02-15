package tn.spring.springboot.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Column
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

    public enum TypeAbonnement {
        ANNUEL,
        SEMESTRIEL,
        MENSUEL
    }
}