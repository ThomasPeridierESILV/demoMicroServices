package fr.nexworld.springbootserver.service;

import fr.nexworld.springbootserver.entities.Produit;

import java.util.List;

public interface ProduitService {
    
    Produit get(Long id);

    List<Produit> getAll();

    Produit post(Produit produit);

    Produit put(Produit produit, Long id);
}
