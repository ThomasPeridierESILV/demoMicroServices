package fr.nexworld.springbootserver.service;

import fr.nexworld.springbootserver.entities.Stock;

import java.util.List;

public interface StockService {

    Stock get(Long id);

    List<Stock> getAll();

    Stock post(Stock stock);

    Stock put(Stock stock, Long id);
}
