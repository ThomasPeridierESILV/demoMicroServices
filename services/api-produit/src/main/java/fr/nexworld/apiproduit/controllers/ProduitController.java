package fr.nexworld.apiproduit.controllers;

import fr.nexworld.domain.entities.Produit;
import fr.nexworld.apiproduit.services.ProduitService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/produits")
public class ProduitController {

    private ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("/{id}")
    Produit get(@PathVariable Long id) {
        return this.produitService.get(id);
    }

    @GetMapping
    List<Produit> getAll() {
        return this.produitService.getAll();
    }

    @PostMapping
    Produit post(@RequestBody Produit produit) {
        return this.produitService.post(produit);
    }

    @PutMapping("/{id}")
    Produit put(@RequestBody Produit produit, @PathVariable Long id) {
        return this.produitService.put(produit, id);
    }
}