package fr.nexworld.apistock.services;

import fr.nexworld.apistock.entities.Stock;

import java.util.List;

public interface StockService {

    Stock get(Long id);

    List<Stock> getAll();

    Stock post(Stock stock);

    Stock put(Stock stock, Long id);

}
