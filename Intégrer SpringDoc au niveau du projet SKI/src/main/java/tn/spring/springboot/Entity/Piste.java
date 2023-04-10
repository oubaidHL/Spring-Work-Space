package tn.spring.springboot.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPiste")
    private Integer idPiste; // Clé primaire
    private Long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private Integer longeur;
    private Integer pente;

    @ManyToMany
    private Set<Skieur> skieurs = new HashSet<>();

    public Integer getIdPiste() {
        return idPiste;
    }

    public void setIdPiste(Integer idPiste) {
        this.idPiste = idPiste;
    }

    public Long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(Long numPiste) {
        this.numPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Integer getLongeur() {
        return longeur;
    }

    public void setLongeur(Integer longeur) {
        this.longeur = longeur;
    }

    public Integer getPente() {
        return pente;
    }

    public void setPente(Integer pente) {
        this.pente = pente;
    }

    public Set<Skieur> getSkieurs() {
        return skieurs;
    }

    public void setSkieurs(Set<Skieur> skieurs) {
        this.skieurs = skieurs;
    }

    public enum Couleur {
        VERT,
        BLEU,
        ROUGE,
        NOIR
    }


}
