package fr.nexworld.serverspringboot.controller;

import fr.nexworld.serverspringboot.entities.Produit;
import fr.nexworld.serverspringboot.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/produits")
public class ProduitController {

    private ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService){
        this.produitService = produitService;
    }

    @GetMapping("/{id}")
    Produit get(@PathVariable Long id){
        return produitService.get(id);
    }

    @GetMapping
    List<Produit> getAll(){
        return produitService.getAll();
    }

    @PostMapping
    Produit post(@RequestBody Produit produit){ return produitService.post(produit);}

    @PutMapping("/{id}")
    Produit put(@RequestBody Produit produit, @PathVariable Long id){ return produitService.put(produit, id);}
}
