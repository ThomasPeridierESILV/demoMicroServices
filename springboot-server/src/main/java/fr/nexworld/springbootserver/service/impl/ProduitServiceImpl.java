package fr.nexworld.springbootserver.service.impl;

import fr.nexworld.springbootserver.entities.Produit;
import fr.nexworld.springbootserver.repository.ProduitRepository;
import fr.nexworld.springbootserver.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;

    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit get(Long id) {
        return this.produitRepository.findOne(id);
    }

    @Override
    public List<Produit> getAll() {
        return this.produitRepository.findAll();
    }

    @Override
    public Produit post(Produit produit) {
        return this.produitRepository.save(produit);
    }

    @Override
    public Produit put(Produit produit, Long id) {
        produit.setId(id);
        return this.produitRepository.save(produit);
    }
}
