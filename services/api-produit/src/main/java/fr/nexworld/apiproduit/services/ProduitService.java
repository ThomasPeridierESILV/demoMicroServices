package fr.nexworld.apiproduit.services;

import fr.nexworld.domain.entities.Produit;

import java.util.List;

public interface ProduitService {

    Produit get(Long id);

    List<Produit> getAll();

    Produit post(Produit produit);

    Produit put(Produit produit, Long id);

}
