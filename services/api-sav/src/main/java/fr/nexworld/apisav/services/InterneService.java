package fr.nexworld.apisav.services;

import fr.nexworld.domain.entities.Interne;

import java.util.List;

public interface InterneService {

    Interne get(Long id);

    List<Interne> getAll();

    Interne post(Interne interne);

    Interne put(Interne interne, Long id);

}
