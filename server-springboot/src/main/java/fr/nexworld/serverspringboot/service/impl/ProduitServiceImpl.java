package fr.nexworld.serverspringboot.service.impl;

import fr.nexworld.serverspringboot.entities.Produit;
import fr.nexworld.serverspringboot.repository.ProduitRepository;
import fr.nexworld.serverspringboot.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    private ProduitRepository produitRepository;

    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit get(Long id) {
        return produitRepository.findOne(id);
    }

    @Override
    public List<Produit> getAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit post(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit put(Produit produit, Long id) {
        produit.setId(id);
        return produitRepository.save(produit);
    }
}
