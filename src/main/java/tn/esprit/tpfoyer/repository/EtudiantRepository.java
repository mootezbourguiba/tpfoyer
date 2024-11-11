package tn.esprit.tpfoyer.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.entity.Etudiant;

import javax.swing.*;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{

}

