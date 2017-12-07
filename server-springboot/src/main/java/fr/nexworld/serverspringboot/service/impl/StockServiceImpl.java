package fr.nexworld.serverspringboot.service.impl;

import fr.nexworld.serverspringboot.entities.Stock;
import fr.nexworld.serverspringboot.repository.StockRepository;
import fr.nexworld.serverspringboot.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    
    private StockRepository stockRepository;
    
    @Autowired
    public StockServiceImpl(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock get(Long id) {
        return stockRepository.findOne(id);
    }

    @Override
    public List<Stock> getAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock post(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock put(Stock stock, Long id) {
        stock.setId(id);
        return stockRepository.save(stock);
    }
}
