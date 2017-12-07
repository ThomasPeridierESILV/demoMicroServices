package fr.nexworld.serverspringboot.repository;

import fr.nexworld.serverspringboot.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long>{
}
