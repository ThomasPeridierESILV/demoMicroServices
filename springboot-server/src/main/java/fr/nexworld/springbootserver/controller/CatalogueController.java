package fr.nexworld.springbootserver.controller;

import fr.nexworld.springbootserver.entities.Catalogue;
import fr.nexworld.springbootserver.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogues")
@CrossOrigin(origins = "*", allowedHeaders ="*")
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
