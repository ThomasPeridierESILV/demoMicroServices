package fr.nexworld.apisav.services.impl;

import fr.nexworld.apisav.entities.Interne;
import fr.nexworld.apisav.repositories.InterneRepository;
import fr.nexworld.apisav.services.InterneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterneServiceImpl implements InterneService {

    private InterneRepository interneRepository;

    @Autowired
    public InterneServiceImpl(InterneRepository interneRepository) {
        this.interneRepository = interneRepository;
    }

    @Override
    public Interne get(Long id) {
        return this.interneRepository.findOne(id);
    }

    @Override
    public List<Interne> getAll() {
        return this.interneRepository.findAll();
    }

    @Override
    public Interne post(Interne interne) {
        return this.interneRepository.save(interne);
    }

    @Override
    public Interne put(Interne interne, Long id) {
        interne.setId(id);
        return this.interneRepository.save(interne);
    }
}
