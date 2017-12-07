package fr.nexworld.serverspringboot.service.impl;

import fr.nexworld.serverspringboot.entities.Catalogue;
import fr.nexworld.serverspringboot.repository.CatalogueRepository;
import fr.nexworld.serverspringboot.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    private CatalogueRepository catalogueRepository;

    @Autowired
    public CatalogueServiceImpl(CatalogueRepository catalogueRepository){
        this.catalogueRepository = catalogueRepository;
    }

    @Override
    public Catalogue get(Long id) {
        return catalogueRepository.findOne(id);
    }

    @Override
    public List<Catalogue> getAll() {
        return catalogueRepository.findAll();
    }

    @Override
    public Catalogue post(Catalogue catalogue) {
        return catalogueRepository.save(catalogue);
    }

    @Override
    public Catalogue put(Catalogue catalogue, Long id) {
        catalogue.setId(id);
        return catalogueRepository.save(catalogue);
    }
}
