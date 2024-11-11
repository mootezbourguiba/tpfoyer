package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService{
    ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return List.of();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return null;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public void removeChambre(Long chambreId) {

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return null;
    }
}
