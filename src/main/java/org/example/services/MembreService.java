package org.example.services;

import org.example.model.Membre;

import java.util.List;

public interface MembreService {
    List<Membre> findAll();

    Membre save(Membre membre);

    Membre findById(Long id);

    void deleteById(Long id);

    Membre update(Membre membre);

    Membre findByFirstname(String firstname);
}
