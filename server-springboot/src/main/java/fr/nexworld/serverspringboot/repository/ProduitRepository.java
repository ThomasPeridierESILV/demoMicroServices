package fr.nexworld.serverspringboot.repository;

import fr.nexworld.serverspringboot.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
}
