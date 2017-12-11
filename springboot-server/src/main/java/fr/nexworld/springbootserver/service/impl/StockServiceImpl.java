package fr.nexworld.springbootserver.service.impl;

import fr.nexworld.springbootserver.entities.Stock;
import fr.nexworld.springbootserver.repository.StockRepository;
import fr.nexworld.springbootserver.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    private StockRepository stockRepository;

    @Autowired
    public StockServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock get(Long id) {
        return this.stockRepository.findOne(id);
    }

    @Override
    public List<Stock> getAll() {
        return this.stockRepository.findAll();
    }

    @Override
    public Stock post(Stock stock) {
        return this.stockRepository.save(stock);
    }

    @Override
    public Stock put(Stock stock, Long id) {
        stock.setId(id);
        return this.stockRepository.save(stock);
    }
}
