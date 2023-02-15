package tn.spring.springboot.Entity;

import jakarta.persistence.*;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float prix;
    private int creneau;

    public enum TypeCours {
        COLLECTIF_ENFANT,
        COLLECTIF_ADULTE,
        PARTICULIER
    }

    public enum Support {
        SKI,
        SNOWBOARD
    }
}

