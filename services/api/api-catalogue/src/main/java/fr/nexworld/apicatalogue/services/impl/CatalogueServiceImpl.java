package fr.nexworld.apicatalogue.services.impl;

import fr.nexworld.apicatalogue.entities.Catalogue;
import fr.nexworld.apicatalogue.repositories.CatalogueRepository;
import fr.nexworld.apicatalogue.services.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    private CatalogueRepository catalogueRepository;

    @Autowired
    public CatalogueServiceImpl(CatalogueRepository catalogueRepository) {
        this.catalogueRepository = catalogueRepository;
    }

    @Override
    public Catalogue get(Long id) {
        return this.catalogueRepository.findOne(id);
    }

    @Override
    public List<Catalogue> getAll() {
        return this.catalogueRepository.findAll();
    }

    @Override
    public Catalogue post(Catalogue catalogue) {
        return this.catalogueRepository.save(catalogue);
    }

    @Override
    public Catalogue put(Catalogue catalogue, Long id) {
        catalogue.setId(id);
        return this.catalogueRepository.save(catalogue);
    }
}
