package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;

    @ManyToOne
    private Chambre chambre;
}
