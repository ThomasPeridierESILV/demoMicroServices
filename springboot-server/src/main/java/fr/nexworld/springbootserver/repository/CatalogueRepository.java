package fr.nexworld.springbootserver.repository;

import fr.nexworld.springbootserver.entities.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, Long>{
}
