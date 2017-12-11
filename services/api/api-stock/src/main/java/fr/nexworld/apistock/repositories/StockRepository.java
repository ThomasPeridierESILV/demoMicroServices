package fr.nexworld.apistock.repositories;

import fr.nexworld.apistock.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
