package org.example.services.impl;

import org.example.model.Membre;
import org.example.repository.MembreRepository;
import org.example.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreServiceImpl implements MembreService {

    @Autowired
    private MembreRepository membreRepository;

    @Override
    public List<Membre> findAll() {
        return membreRepository.findAll();
    }

    @Override
    public Membre save(Membre membre) {
        return membreRepository.save(membre);
    }

    @Override
    public Membre findById(Long id) {
        return membreRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        membreRepository.deleteById(id);
    }


    @Override
    public Membre update(Membre membre) {
        return membreRepository.save(membre);
    }


    @Override
    public Membre findByFirstname(String firstname) {
        return membreRepository.findByFirstname(firstname);
    }
}
