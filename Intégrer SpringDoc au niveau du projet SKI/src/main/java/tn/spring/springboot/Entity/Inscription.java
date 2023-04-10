package tn.spring.springboot.Entity;

import jakarta.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;

    @Column(nullable = false)
    private int numSemaine;


    @ManyToOne(cascade = CascadeType.ALL)
    private Skieur skieur;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cours cours;

    public Inscription() {}

    public Inscription(int numSemaine, Skieur skieur) {
        this.numSemaine = numSemaine;
        this.setSkieur(skieur);
    }

    public long getNumInscription() {
        return numInscription;
    }

    public void setNumInscription(long numInscription) {
        this.numInscription = numInscription;
    }

    public int getNumSemaine() {
        return numSemaine;
    }

    public void setNumSemaine(int numSemaine) {
        this.numSemaine = numSemaine;
    }

    public Skieur getSkieur() {
        return skieur;
    }

    public void setSkieur(Skieur skieur) {
        this.skieur = skieur;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

//    public Skieur getSkieur() {
//        return skieur;
//    }
//
//    public void setSkieur(Skieur skieur) {
//        this.skieur = skieur;
//    }
}
