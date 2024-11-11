package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bloc implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;

    @OneToMany(mappedBy = "bloc")
    private List<Foyer> foyers;
}
