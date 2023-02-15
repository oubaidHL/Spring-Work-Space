package tn.spring.springboot.Entity;

import jakarta.persistence.*;

@Entity
public class Piste {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="idPiste")
        private Integer idPiste;
        @Column
        private Long numPiste;
        @Column
        private String nomPiste;
        @Enumerated(EnumType.STRING)
        private Couleur couleur;
        @Column
        private Integer longeur;
        @Column
        private Integer pente;

        public enum Couleur {
            ROUGE,
            BLEU,
            VERT,
            JAUNE
        }
    }