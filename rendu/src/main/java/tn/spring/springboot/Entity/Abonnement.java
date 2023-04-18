package tn.spring.springboot.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
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
    private static TypeAbonnement TypeAbonnement;

    public long getNumAbon() {
        return numAbon;
    }

    public void setNumAbon(long numAbon) {
        this.numAbon = numAbon;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public float getPrixAbon() {
        return prixAbon;
    }

    public void setPrixAbon(float prixAbon) {
        this.prixAbon = prixAbon;
    }

    public TypeAbonnement getTypeAbon() {
        return TypeAbonnement;
    }

    public void setTypeAbon(TypeAbonnement typeAbon) {
        this.TypeAbonnement = typeAbon;
    }



    public enum TypeAbonnement {
        ANNUEL,
        SEMESTRIEL,
        MENSUEL
    }
    public Abonnement.TypeAbonnement getTypeAbonnement() {
        return Abonnement.TypeAbonnement;
    }
}