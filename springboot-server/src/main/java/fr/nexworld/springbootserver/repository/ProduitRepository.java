package fr.nexworld.springbootserver.repository;

import fr.nexworld.springbootserver.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
}
