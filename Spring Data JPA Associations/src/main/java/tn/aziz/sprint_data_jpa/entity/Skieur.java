package tn.aziz.sprint_data_jpa.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


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

    private String ville;

    @ManyToMany(mappedBy = "skieurs")
    private Set<Piste> pistes = new HashSet<>();

    @OneToMany(mappedBy = "skieur", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnement;


    public Skieur() {}

    public Skieur(String nomS, String prenomS, Date dateNaissance, String ville) {
        this.nomS = nomS;
        this.prenomS = prenomS;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    public long getNumSkieur() {
        return numSkieur;
    }

    public void setNumSkieur(long numSkieur) {
        this.numSkieur = numSkieur;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
