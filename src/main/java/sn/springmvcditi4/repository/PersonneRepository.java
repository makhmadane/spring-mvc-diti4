package sn.springmvcditi4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.springmvcditi4.entity.Personne;

import java.util.List;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
    List<Personne> findByNomOrPrenom(String nom, String prenom);
    List<Personne> findByNomContainingIgnoreCaseOrPrenomContainsIgnoreCase(String nom, String prenom);

}
