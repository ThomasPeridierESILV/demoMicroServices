package fr.nexworld.springbootserver.repository;

import fr.nexworld.springbootserver.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long>{
}
