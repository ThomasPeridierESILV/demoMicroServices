package fr.nexworld.apistock.repositories;

import fr.nexworld.domain.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
