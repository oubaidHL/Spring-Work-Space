package tn.spring.springboot.Entity;
import jakarta.persistence.*;


@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;

    @Column(nullable = false)
    private int numSemaine;

    // Default constructor

    // Constructor with arguments

}