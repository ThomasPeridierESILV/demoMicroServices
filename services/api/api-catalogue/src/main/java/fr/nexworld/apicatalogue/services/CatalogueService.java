package fr.nexworld.apicatalogue.services;

import fr.nexworld.apicatalogue.entities.Catalogue;

import java.util.List;

public interface CatalogueService {

    Catalogue get(Long id);

    List<Catalogue> getAll();

    Catalogue post(Catalogue catalogue);

    Catalogue put(Catalogue catalogue, Long id);

}
