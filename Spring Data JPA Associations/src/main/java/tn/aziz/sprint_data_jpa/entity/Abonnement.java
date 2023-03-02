package tn.aziz.sprint_data_jpa.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numAbon;
    private Date dateDebut;
    private Date dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;

    public enum TypeAbonnement {
        ANNUEL,
        SEMESTRIEL,
        MENSUEL
    }
}