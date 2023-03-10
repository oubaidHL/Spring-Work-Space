package tn.esprit.tp1.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "departement")
public class Departement implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;

    private String nomDepart;

    @OneToMany(mappedBy = "departement", fetch = FetchType.EAGER)
    private List<Etudiant> etudiants = new ArrayList<>();
}
