package fr.nexworld.apicatalogue.controllers;


import fr.nexworld.apicatalogue.entities.Catalogue;
import fr.nexworld.apicatalogue.services.CatalogueService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/catalogues")
public class CatalogueController {

    private CatalogueService catalogueService;

    @Autowired
    public CatalogueController(CatalogueService catalogueService) {
        this.catalogueService = catalogueService;
    }

    @GetMapping("/{id}")
    Catalogue get(@PathVariable Long id) {
        return this.catalogueService.get(id);
    }

    @GetMapping
    List<Catalogue> getAll() {
        return this.catalogueService.getAll();
    }

    @PostMapping
    Catalogue post(@RequestBody Catalogue catalogue) {
        return this.catalogueService.post(catalogue);
    }

    @PutMapping("/{id}")
    Catalogue put(@RequestBody Catalogue catalogue, @PathVariable Long id) {
        return this.catalogueService.put(catalogue, id);
    }
}