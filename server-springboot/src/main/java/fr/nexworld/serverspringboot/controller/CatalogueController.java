package fr.nexworld.serverspringboot.controller;

import fr.nexworld.serverspringboot.entities.Catalogue;
import fr.nexworld.serverspringboot.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/catalogues")
public class CatalogueController {

    private CatalogueService catalogueService;

    @Autowired
    public CatalogueController(CatalogueService catalogueService){
        this.catalogueService = catalogueService;
    }

    @GetMapping("/{id}")
    Catalogue get(@PathVariable Long id){
        return catalogueService.get(id);
    }

    @GetMapping
    List<Catalogue> getAll(){
        return catalogueService.getAll();
    }

    @PostMapping
    Catalogue post(@RequestBody Catalogue catalogue){ return catalogueService.post(catalogue);}

    @PutMapping("/{id}")
    Catalogue put(@RequestBody Catalogue catalogue, @PathVariable Long id){ return catalogueService.put(catalogue, id);}
}
