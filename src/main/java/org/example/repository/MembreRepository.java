package org.example.repository;

import org.example.model.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MembreRepository extends JpaRepository<Membre , Long> {

}
