package tn.aziz.sprint_data_jpa.entity;

import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

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
