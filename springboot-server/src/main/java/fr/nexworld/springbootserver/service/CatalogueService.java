package fr.nexworld.springbootserver.service;

import fr.nexworld.springbootserver.entities.Catalogue;

import java.util.List;

public interface CatalogueService {

    Catalogue get(Long id);

    List<Catalogue> getAll();

    Catalogue post(Catalogue catalogue);

    Catalogue put(Catalogue catalogue, Long id);

}
